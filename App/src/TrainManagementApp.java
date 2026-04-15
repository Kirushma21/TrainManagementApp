// TrainManagementApp.java

import java.util.Scanner;

public class TrainManagementApp {

    // 🔹 Linear Search Method
    public static boolean linearSearch(String[] arr, String key) {

        for (int i = 0; i < arr.length; i++) {

            // Compare using equals()
            if (arr[i].equals(key)) {
                return true; // Found
            }
        }

        return false; // Not found
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // Input IDs
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // Search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Call search
        boolean found = linearSearch(bogieIds, key);

        // Output
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND");
        }

        sc.close();
    }
}