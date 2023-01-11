package Abdul_Bari_DSA;

public class _6_Taylor_series {

    // Recursive Function with static
    // variables p and f
    static double p = 1, f = 1;

    static double e(int x, int n) {
        double r;
        // Termination condition
        if (n == 0)
            return 1;
        // Recursive call
        r = e(x, n - 1);
        // Update the power of x
        p = p * x;
        // Factorial
        f = f * n;
        return (r + p / f);
    }

    public static void main(String[] args) {
        int x = 1, n = 10;
        System.out.println((e(x, n)));
    }
}
