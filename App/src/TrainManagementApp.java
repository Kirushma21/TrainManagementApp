// TrainManagementApp.java

import java.util.Scanner;

public class TrainManagementApp {

    public static void bubbleSort(int[] arr) {

        int n = arr.length;

        // Nested loops
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                // Compare adjacent elements
                if (arr[j] > arr[j + 1]) {

                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of passenger bogies: ");
        int n = sc.nextInt();

        int[] capacities = new int[n];

        // Input
        System.out.println("Enter capacities:");
        for (int i = 0; i < n; i++) {
            capacities[i] = sc.nextInt();
        }

        // Sort using Bubble Sort
        bubbleSort(capacities);

        // Output
        System.out.println("Sorted capacities:");
        for (int cap : capacities) {
            System.out.print(cap + " ");
        }

        sc.close();
    }
}