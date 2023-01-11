package Keerti_Recursion_and_Backtracking;

public class _02_fibonacci_recursion {
    public static void main(String[] args) {
        _02_fibonacci_recursion fib = new _02_fibonacci_recursion();
        System.out.println(fib.fib(9));
    }

    int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }
}
