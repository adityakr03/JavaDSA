package Abdul_Bari_DSA;

public class _8_taylor_series_using_loop {
    public static void main(String[] args) {
        int i, x = 10, n = 1;
        double s = 1, num = 1, den = 1;
        for (i = 1; i <= n; i++) {
            num *= x;
            den *= i;
            s += num / den;
        }
    }
}
