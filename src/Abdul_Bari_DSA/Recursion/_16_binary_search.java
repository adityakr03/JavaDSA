package Abdul_Bari_DSA.Recursion;

import java.util.Scanner;

public class _16_binary_search {
    static int RecursiveBinarySearch(int element, int[] arr, int high, int low) {
        if (high >= low) {
            int mid = (low + high) / 2;
            if (element == arr[mid]) {
                System.out.println("Element found at position " + mid);
                return mid;
            } else if (element < arr[mid])
                return RecursiveBinarySearch(element, arr, mid - 1, low);
            else
                return RecursiveBinarySearch(element, arr, high, mid + 1);
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Enter the element you want to search for: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        RecursiveBinarySearch(element, arr, arr.length, 0);
    }
}
