package PatternByStriver;

import java.util.Scanner;

public class _01_pattern {
    // here we have to print the following pattern:
    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
