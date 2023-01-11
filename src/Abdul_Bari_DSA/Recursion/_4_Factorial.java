package Abdul_Bari_DSA;

import java.util.Scanner;

public class _4_Factorial {
    static int fact(int n) {
        if (n == 0)
            return 1;
        else {
            return fact(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
