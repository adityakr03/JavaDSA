package Abdul_Bari_DSA;

import java.util.Scanner;

public class _1_Arrays_Basics {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int i = 0;
        for (int x : A) {
            System.out.print("Enter the element at A[" + i + "]: ");
            A[i] = sc.nextInt();
            i++;
        }
        i = 0;
        for (int a : A) {
            System.out.print("Element at A[" + i + "]: ");
            System.out.println(A[i]);
            i++;
        }
    }
}
