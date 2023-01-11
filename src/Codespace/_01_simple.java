package Codespace;

import java.util.Scanner;

public class _01_simple {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
                System.out.print(n + " ");
            } else {
                n = (n * 3) + 1;
                System.out.print(n + " ");
            }
        }
    }
}