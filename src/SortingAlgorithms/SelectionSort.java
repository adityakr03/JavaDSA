package SortingAlgorithms;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr;
        int swap_count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Array before Sorting: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");

        // Selection Sort Implementation
        for (int i = 0; i < arr.length - 1; i++) {
            // Taking initial value of min as i.
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            // If the value of min is not changed, then it means above if condition is not true, hence, no need of swapping.
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                swap_count++;
            }
        }

        System.out.print("Array after Sorting: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(",");
        }
        System.out.println("]");
        System.out.println("Number of swaps: " + swap_count);

    }
}
