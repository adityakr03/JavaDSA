package Abdul_Bari_DSA.Arrays;

import java.util.Scanner;

public class _15_binary_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Taking a sorted array as binary search is valid only for sorted array.
        System.out.print("Enter the element to search for: ");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        boolean found = false;
        int low = 0, high = arr.length - 1, mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;
            if (element == arr[mid]) {
                System.out.println("Element found at position " + mid);
                found = true;
                break;
            } else if (element < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        if (!found)
            System.out.println("Element not found!");
    }
}
