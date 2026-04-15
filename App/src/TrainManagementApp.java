// TrainManagementApp.java

import java.util.Arrays;
import java.util.Scanner;

public class TrainManagementApp {

    // 🔹 Binary Search Method
    public static boolean binarySearch(String[] arr, String key) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int result = key.compareTo(arr[mid]);

            if (result == 0) {
                return true; // Found
            } else if (result > 0) {
                low = mid + 1; // Search right
            } else {
                high = mid - 1; // Search left
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

        // 🔹 Sort before binary search (IMPORTANT)
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Call binary search
        boolean found = binarySearch(bogieIds, key);

        // Output
        if (found) {
            System.out.println("Bogie ID " + key + " FOUND");
        } else {
            System.out.println("Bogie ID " + key + " NOT FOUND");
        }

        sc.close();
    }
}