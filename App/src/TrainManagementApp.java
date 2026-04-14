import java.util.HashMap;
import java.util.Map;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashMap for bogie-capacity mapping
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // 🔹 Insert bogie capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 48);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("Cargo", 1000);
        bogieCapacityMap.put("Guard", 10);

        // 🔹 Display bogie capacities
        System.out.println("\nBogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}