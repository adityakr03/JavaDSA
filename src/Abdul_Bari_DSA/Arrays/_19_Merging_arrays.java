package Abdul_Bari_DSA.Arrays;

import java.util.Scanner;

public class _19_Merging_arrays {
    public static void main(String[] args) {
        System.out.print("Enter the size of array 1: ");
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int[] ar1 = new int[s1];
        System.out.println("Enter the elements in array 1:-");
        int i, j;
        for (i = 0; i < ar1.length; i++) {
            System.out.print("Enter the element at position " + i + ": ");
            ar1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array 2: ");
        s1 = sc.nextInt();
        int[] ar2 = new int[s1];
        System.out.println("Enter the elements in array 1:-");
        for (i = 0; i < ar2.length; i++) {
            System.out.print("Enter the element at position " + i + ": ");
            ar2[i] = sc.nextInt();
        }
        System.out.println("Printing the merged array: ");
        int[] mgar = new int[ar1.length + ar2.length];
        for (i = 0; i < ar1.length; i++) {
            mgar[i] = ar1[i];
        }
        for (i = ar1.length, j = 0; i < mgar.length; i++, j++) {
            mgar[i] = ar2[j];
        }
        for (int x : mgar) {
            System.out.println(x);
        }
    }
}
