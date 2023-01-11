package Abdul_Bari_DSA;

public class _2_TailHeadRecursion {
    static void fun1(int n) {
        if (n > 0) {
            System.out.println(n); // Will print in descending order.
            fun1(n - 1); // Tail recursion
        }
    }

    static void fun2(int n) {
        if (n > 0) {
            fun2(n - 1); // Head recursion
            System.out.println(n); // Will print in ascending order.
        }
    }

    public static void main(String[] args) {
        int x = 3;
        System.out.println("Printing during recursive call.(Getting inside the room, turning on the light, then proceeding to another room and repeating.)");
        fun1(x); // Tail Recursion call
        System.out.println("Printing during returning back from recursive call.(Getting inside the rooms till the last room is reached , then turning on the lights from the last room to the first room.");
        fun2(x); // Head Recursion call
    }
}
