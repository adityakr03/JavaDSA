package PatternByStriver;

import java.util.Scanner;

public class _04_pattern {
    /*

    here we have to print the following pattern:

    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++)
                System.out.print(i + " ");
            System.out.println();
        }
    }
}
