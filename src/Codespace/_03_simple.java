package Codespace;

import java.util.Scanner;

public class _03_simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        if (ch.length % 2 == 0)
            System.out.println("HEHE LOVEEEEE !");
        else if (ch.length % 2 == 1)
            System.out.println("IGNORE !");
    }
}
