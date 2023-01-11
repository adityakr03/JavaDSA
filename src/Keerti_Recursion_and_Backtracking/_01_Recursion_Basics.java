package Keerti_Recursion_and_Backtracking;

public class _01_Recursion_Basics {
    static int count = 0;

    public static void main(String[] args) {
        _01_Recursion_Basics cfs = new _01_Recursion_Basics();
        cfs.cfs(5);
    }

    void cfs(int n) {
        if (count >= 5)
            System.exit(0);
        else {
            System.out.println("CFS");
            count++;
        }
        cfs(n - 1);
    }
}
