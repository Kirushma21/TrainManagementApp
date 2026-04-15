// TrainManagementApp.java

import java.util.Arrays;
import java.util.Scanner;

public class TrainManagementApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of bogie types: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] bogies = new String[n];

        // Input bogie names
        System.out.println("Enter bogie names:");
        for (int i = 0; i < n; i++) {
            bogies[i] = sc.nextLine();
        }

        // 🔹 Built-in sorting
        Arrays.sort(bogies);

        // Output
        System.out.println("Sorted bogie names:");
        System.out.println(Arrays.toString(bogies));

        sc.close();
    }
}