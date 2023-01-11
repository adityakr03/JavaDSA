package Codespace;

import java.util.Scanner;

public class _02_simple {
    public static void main(String[] args) {
        int A = 0, C = 0, G = 0, T = 0;
        System.out.print("Enter a string (Consisting of A, C, G and T only) : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'A')
                A++;
            else if (a[i] == 'C')
                C++;
            else if (a[i] == 'G')
                G++;
            else if (a[i] == 'T')
                T++;
        }
        if (A > C && A > G && A > T)
            System.out.println(A);
        else if (C > A && C > G && C > T)
            System.out.println(C);
        else if (G > A && G > C && G > T)
            System.out.println(C);
        else if (T > A && T > G && T > C)
            System.out.println(C);
    }
}
