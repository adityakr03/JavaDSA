package Abdul_Bari_DSA;

import java.util.Scanner;

public class _5_Power {
    // Traditional Slow method of getting power.
    static int pow(int n, int p) {
        if (p == 0)
            return 1;
        else {
            return pow(n, p - 1) * n;
        }
    }

    // Faster method of getting power.
    static int powEnhanced(int n, int p) {
        if (p == 0)
            return 1;
        else if (p % 2 == 0) {
            return powEnhanced(n, p / 2) * n;
        } else
            return powEnhanced(n, (p - 1) / 2) * n;
    }

    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Enter power: ");
        int p = sc.nextInt();
        System.out.println(pow(n, p)); // Call to slow method as it multiplies (n*n) for p number of times.
        System.out.println(powEnhanced(n, p)); // Call to faster method as it doesn't multiply (n*n) for p number of times.
    }
}
