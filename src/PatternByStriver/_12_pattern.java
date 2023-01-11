package PatternByStriver;

import java.util.Scanner;

public class _12_pattern {
    /*

    here we have to print the following pattern: (Solved by chatGPT)
    Write a program in java to print the following pattern:

    1             1
    1 2         2 1
    1 2 3     3 2 1
    1 2 3 4 4 3 2 1

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of pattern: ");
        int n = sc.nextInt();
        // Loop through the rows of the pattern
        for (int i = 1; i <= n; i++) {
            // Print the numbers in the row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Print the spaces between the two sets of numbers
            for (int j = 1; j <= (2 * n) - (2 * i); j++) {
                System.out.print(" ");
            }
            // Print the numbers in the row in reverse order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            // Move to the next line
            System.out.println();
        }
    }
}

