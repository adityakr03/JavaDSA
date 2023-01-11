import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class temp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        if(N%2==0) {
            if (2 <= N && N <= 5)
                System.out.println("Not Weird");
            else if (6 <= N && N <= 20)
                System.out.println("Weird");
            else if (N > 20)
                System.out.println("Weird");

        }
        else if (N%2 == 1)
            System.out.println("Weird");
        else
            System.out.println("Weird");
    }
}

