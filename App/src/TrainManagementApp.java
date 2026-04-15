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
                return true;
            } else if (result > 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogies: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogieIds = new String[n];

        // 🔹 FAIL-FAST VALIDATION
        if (bogieIds.length == 0) {
            throw new IllegalStateException("No bogies available for search");
        }

        // Input
        System.out.println("Enter bogie IDs:");
        for (int i = 0; i < n; i++) {
            bogieIds[i] = sc.nextLine();
        }

        // Sort before search
        Arrays.sort(bogieIds);

        System.out.println("Sorted Bogie IDs: " + Arrays.toString(bogieIds));

        // Search key
        System.out.print("Enter bogie ID to search: ");
        String key = sc.nextLine();

        // Search
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