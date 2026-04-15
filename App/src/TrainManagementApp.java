// TrainConsistApp.java

import java.util.*;

// 🔹 Custom Runtime Exception
class CargoSafetyException extends RuntimeException {
    public CargoSafetyException(String message) {
        super(message);
    }
}

// 🔹 Goods Bogie Class
class GoodsBogie {
    String shape;   // Rectangular / Cylindrical
    String cargo;

    GoodsBogie(String shape) {
        this.shape = shape;
    }

    // 🔹 Assign cargo with safety check
    public void assignCargo(String cargoType) {
        try {
            // Unsafe condition
            if (shape.equalsIgnoreCase("Rectangular") &&
                    cargoType.equalsIgnoreCase("Petroleum")) {
                throw new CargoSafetyException("Unsafe: Petroleum cannot be loaded in Rectangular bogie");
            }

            // Safe assignment
            this.cargo = cargoType;
            System.out.println("Cargo assigned: " + cargoType + " to " + shape + " bogie");

        } catch (CargoSafetyException e) {
            System.out.println("Error: " + e.getMessage());

        } finally {
            System.out.println("Cargo assignment process completed.\n");
        }
    }

    public String toString() {
        return shape + " Bogie -> Cargo: " + (cargo != null ? cargo : "None");
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        List<GoodsBogie> train = new ArrayList<>();

        GoodsBogie b1 = new GoodsBogie("Cylindrical");
        GoodsBogie b2 = new GoodsBogie("Rectangular");

        train.add(b1);
        train.add(b2);

        // ✅ Safe assignment
        b1.assignCargo("Petroleum");

        // ❌ Unsafe assignment (handled safely)
        b2.assignCargo("Petroleum");

        // Continue execution
        System.out.println("Final Train Consist:");
        for (GoodsBogie b : train) {
            System.out.println(b);
        }
    }
}