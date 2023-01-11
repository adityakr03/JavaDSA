package Abdul_Bari_DSA.Arrays;

import java.util.Scanner;

public class _14_linear_search {
    public static void main(String[] args) {
        System.out.print("Enter the number of elements in the array: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i;
        int[] arr = new int[num];
        for (i = 0; i < arr.length; i++) {
            System.out.print("Enter the element at position " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i++) {
            System.out.println("Element at position " + i + " is : " + arr[i]);
        }
        System.out.print("Enter the element to search for: ");
        int element = sc.nextInt();
        boolean found = false;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("Element found at position " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Element not found!");
        }
    }
}
