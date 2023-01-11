package Abdul_Bari_DSA.Recursion;

public class _10_nCr {
    static int nCr(int n, int r) {
        if (n == r || r == 0)
            return 1;
        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {
        System.out.println(nCr(5, 2));
    }
}
