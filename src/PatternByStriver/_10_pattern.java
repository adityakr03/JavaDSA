package PatternByStriver;

import java.util.Scanner;

public class _10_pattern {
    /*

    here we have to print the following pattern:

    *
    * *
    * * *
    * * * *
    * * * * *
    * * * *
    * * *
    * *
    *

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();

        for (int k = 0; k < n - 1; k++) {
            if (k < n)
                for (int j = 0; j < k * 2 + 1; j = j + 2)
                    System.out.print("* ");
            System.out.println();
        }
        for (int k = n; k > 0; k--) {
            if (k > 0)
                for (int j = k * 2; j > 1; j = j - 2)
                    System.out.print("* ");
            System.out.println();
        }
    }
}
