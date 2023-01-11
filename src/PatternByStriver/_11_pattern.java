package PatternByStriver;

import java.util.Scanner;

public class _11_pattern {
    /*

    here we have to print the following pattern:

    1
    0 1
    1 0 1
    0 1 0 1
    1 0 1 0 1

    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the pattern: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i + 1; j++) {
                if (i % 2 == 0)
                    System.out.print((j + 1) % 2 + " ");
                else
                    System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }
}
