import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    String type;   // Cylindrical, Box, Open, etc.
    String cargo;  // Petroleum, Coal, Grain, etc.

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return type + " → " + cargo;
    }
}

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create goods bogie list
        List<GoodsBogie> goodsBogies = new ArrayList<>();

        // 🔹 Add bogies
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));
        goodsBogies.add(new GoodsBogie("Box", "Coal"));
        goodsBogies.add(new GoodsBogie("Open", "Grain"));
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum"));

        // 🔹 Safety compliance check using allMatch()
        boolean isSafe = goodsBogies.stream()
                .allMatch(b ->
                        !b.type.equals("Cylindrical") ||
                                b.cargo.equals("Petroleum")
                );

        // 🔹 Display bogies
        System.out.println("\nGoods Bogies:");
        goodsBogies.forEach(System.out::println);

        // 🔹 Display safety result
        System.out.println("\nSafety Compliance Result:");
        if (isSafe) {
            System.out.println("TRAIN IS SAFE ✔");
        } else {
            System.out.println("TRAIN IS NOT SAFE ❌");
        }
    }
}