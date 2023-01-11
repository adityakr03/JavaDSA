package Abdul_Bari_DSA.Arrays;

import java.util.Scanner;

public class _12_Insert_into_array {

    public static void main(String[] args) {
        int i = 0;
        System.out.print("Enter the length of Array: ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.print("Enter the number of elements in the array: ");
        int elements = sc.nextInt();
        for (i = 0; i < elements; i++) {
            System.out.print("Enter the element at position " + i + " : ");
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < elements; i++) {
            System.out.println("Element at position " + i + " : " + arr[i]);
        }
        System.out.print("Enter 1 if you want to insert an element into the array, or enter 0 to exit: ");
        int check = sc.nextInt();
        if (check != 1)
            return;
        if (check == 1) {
            System.out.print("Enter the index at which the element is to be inserted: ");
            int position = sc.nextInt();
            System.out.print("Enter the element: ");
            int element = sc.nextInt();
            // Incrementing the elements from position to position+1 so that new element can be inserted at position.
            for (i = elements; i >= position; i--) {
                arr[i] = arr[i - 1];
            }
            arr[i] = element;
            for (i = 0; i < elements + 1; i++) {
                System.out.println("Element at position " + i + " : " + arr[i]);
            }
        }
    }


}
