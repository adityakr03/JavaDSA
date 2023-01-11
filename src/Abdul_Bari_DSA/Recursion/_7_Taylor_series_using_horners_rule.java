package Abdul_Bari_DSA.Recursion;

public class _7_Taylor_series_using_horners_rule {
    static double e(int x, int n) {
        double s = 0;
        if (n == 0)
            return s;
        s = 1 + x * s / n;
        return e(x, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(e(2, 10));
    }
}
