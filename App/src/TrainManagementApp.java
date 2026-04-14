import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class TrainApp {

    public static void main(String[] args) {

        // Welcome message
        System.out.println("=== Train Consist Management App ===");

        // Sample inputs (you can change or take Scanner input if needed)
        String trainId = "TRN-1234";
        String cargoCode = "PET-AB";

        // 🔹 Regex patterns
        Pattern trainPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoPattern = Pattern.compile("PET-[A-Z]{2}");

        // 🔹 Matcher objects
        Matcher trainMatcher = trainPattern.matcher(trainId);
        Matcher cargoMatcher = cargoPattern.matcher(cargoCode);

        // 🔹 Validate Train ID
        System.out.println("\nTrain ID Validation:");
        if (trainMatcher.matches()) {
            System.out.println(trainId + " is VALID");
        } else {
            System.out.println(trainId + " is INVALID");
        }

        // 🔹 Validate Cargo Code
        System.out.println("\nCargo Code Validation:");
        if (cargoMatcher.matches()) {
            System.out.println(cargoCode + " is VALID");
        } else {
            System.out.println(cargoCode + " is INVALID");
        }
    }
}