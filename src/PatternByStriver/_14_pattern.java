package PatternByStriver;

import java.util.Scanner;

public class _14_pattern {
    /*

    here we have to print the following pattern:

    A
    A B
    A B C
    A B C D
    A B C D E

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j < i + 1; j++)
                System.out.print(ch++ + " ");
            System.out.println();
        }
    }
}
