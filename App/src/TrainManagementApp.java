// TrainConsistApp.java

import java.util.*;

// 🔹 Custom Exception
class InvalidCapacityException extends Exception {
    public InvalidCapacityException(String message) {
        super(message);
    }
}

// 🔹 Passenger Bogie Class
class PassengerBogie {
    String type;
    int capacity;

    // Constructor with validation
    PassengerBogie(String type, int capacity) throws InvalidCapacityException {
        if (capacity <= 0) {
            throw new InvalidCapacityException("Capacity must be greater than zero");
        }
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return type + " (" + capacity + ")";
    }
}

public class TrainManagementApp {

    public static void main(String[] args) {

        List<PassengerBogie> train = new ArrayList<>();

        try {
            // ✅ Valid bogies
            train.add(new PassengerBogie("Sleeper", 72));
            train.add(new PassengerBogie("AC Chair", 60));

            // ❌ Invalid bogie (will throw exception)
            train.add(new PassengerBogie("First Class", 0));

        } catch (InvalidCapacityException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Print valid bogies
        System.out.println("Train Consist:");
        for (PassengerBogie b : train) {
            System.out.println(b);
        }
    }
}