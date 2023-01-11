package Abdul_Bari_DSA;

import java.util.Scanner;

public class _3_Sum_of_n_numbers {
    static int sum(int n) {
        if (n == 0) {
            return 0;
        } else
            return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sum(n)); // instead directly us the formula sum = n*(n+1)/2
    }
}
