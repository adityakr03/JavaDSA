package Keerti_Recursion_and_Backtracking;

public class _04_problem_1 {
    static int i = 0, count = 0, rec = 0;

    public static void main(String[] args) {
        _04_problem_1 pro = new _04_problem_1();
        pro.pro(16);
    }
// My naive approach using count as a flag
//    void pro(int n) {
//        if (n > 0 && count == 0) {
//            System.out.print(n + " ");
//            rec++;
//            pro(n - 5);
//        } else count++;
//        if (n < 0 || rec >= 0) {
//            System.out.print(n + " ");
//            rec--;
//            pro(n + 5);
//        }
//    }

    // A better recursive approach.
    void pro(int n) {
        if (n < 0 || n == 0) {
            System.out.print(n + " "); // It will run only once when the condition meets.
            return; // It will make the function return, i.e. from base case to the input we provided. If we remove it, we will encounter stack overflow.
        }
        System.out.print(n + " "); // It will be used to print the terms up-to n > 0.
        pro(n - 5);
        System.out.print(n + " "); // It will be used to print the terms when the function returns (in reverse order).

    }
}
