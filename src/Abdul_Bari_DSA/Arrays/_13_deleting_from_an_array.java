package Abdul_Bari_DSA.Arrays;

import java.util.Scanner;

public class _13_deleting_from_an_array {
    public static void main(String[] args) {
        System.out.print("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter the number of elements:  ");
        int elements = sc.nextInt();
        int i;
        for (i = 0; i < elements; i++) {
            System.out.print("Enter the element at " + i + " position : ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < elements; i++) {
            System.out.println("Element at " + i + " position : " + arr[i]);
        }
        System.out.print("Enter the position of the element to delete: ");
        int position = sc.nextInt();
        if (position >= elements + 1) {
            System.out.println("Deletion is not possible in the array.");
        } else {
            // use for loop to delete the element and update the index
            for (i = position - 1; i < elements; i++) {
                arr[i] = arr[i + 1]; // assign arr[i+1] to arr[i]
            }
        }
        for (i = 0; i < elements - 1; i++) {
            System.out.println("Element at " + i + " position : " + arr[i]);
        }
    }
}
