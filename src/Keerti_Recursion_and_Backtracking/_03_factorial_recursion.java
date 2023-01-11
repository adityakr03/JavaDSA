package Keerti_Recursion_and_Backtracking;

public class _03_factorial_recursion {
    public static void main(String[] args) {
        _03_factorial_recursion fact = new _03_factorial_recursion();
        System.out.println(fact.fact(10));
    }

    int fact(int n) {
        if (n == 1 || n == 0)
            return 1;
        return n * fact(n - 1);
    }
}
