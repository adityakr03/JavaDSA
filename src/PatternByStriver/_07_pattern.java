package PatternByStriver;

import java.util.Scanner;

public class _07_pattern {
    /*

    here we have to print the following pattern:

            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *

    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        for (int i = n, k = 0; i > 0; i--, k++) {
            for (int j = i; j > 1; j--)
                System.out.print("  ");
            if (k < n)
                for (int j = 0; j < k * 2 + 1; j++)
                    System.out.print("* ");
            System.out.println();
        }
    }
}
