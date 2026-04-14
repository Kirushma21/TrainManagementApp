import java.util.HashSet;
import java.util.Set;

public class TrainManagementApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Create HashSet for bogie IDs (ensures uniqueness)
        Set<String> bogieIds = new HashSet<>();

        // 🔹 Add bogie IDs (including duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG103");
        bogieIds.add("BG101"); // Duplicate
        bogieIds.add("BG102"); // Duplicate

        // 🔹 Display unique bogie IDs
        System.out.println("\nUnique Bogie IDs in the train:");
        System.out.println(bogieIds);
    }
}