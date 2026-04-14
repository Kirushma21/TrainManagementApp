import java.util.ArrayList;
import java.util.List;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // 🔹 Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // 🔹 Display after adding
        System.out.println("\nPassenger bogies after addition:");
        System.out.println(passengerBogies);

        // 🔹 Remove one bogie (AC Chair)
        passengerBogies.remove("AC Chair");

        // 🔹 Display after removal
        System.out.println("\nPassenger bogies after removal:");
        System.out.println(passengerBogies);

        // 🔹 Check existence
        if (passengerBogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie exists in the train.");
        } else {
            System.out.println("\nSleeper bogie does NOT exist in the train.");
        }

        // 🔹 Final state
        System.out.println("\nFinal passenger bogie list:");
        System.out.println(passengerBogies);
    }
}