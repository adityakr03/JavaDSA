package PatternByStriver;

import java.util.Scanner;

public class _13_pattern {
    /*

    here we have to print the following pattern:

    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

    */
    public static void main(String[] args) {
        int k = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++)
                System.out.print(k++ + " ");
            System.out.println();
        }
    }
}