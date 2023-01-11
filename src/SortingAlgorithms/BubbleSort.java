package SortingAlgorithms;

import java.util.Scanner;

public class BubbleSort {
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
            if (i < arr.length - 1)
                System.out.print(",");
        }
        System.out.println("]");

        // For Optimizing Bubble Sort.
        boolean swap = false;
        // Bubble Sort Implementation.
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                    swap_count++;
                }
            }
            if (!swap) // For sorted array, i.e. for best case, complexity will be O(n) if we use this condition check.
                break;
        }

        System.out.print("Array after sorting: [");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(",");
        }
        System.out.println("]");
        System.out.println("Number of swaps: " + swap_count);

    }
}
