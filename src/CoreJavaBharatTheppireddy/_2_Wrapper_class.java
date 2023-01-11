package CoreJavaBharatTheppireddy;

public class _2_Wrapper_class {
    public static void main(String[] args) {
        int x = 10;
        Integer y = Integer.valueOf(x); // Conversion of primitive int to object Integer.(boxing)
        int z = y.intValue(); // Reverse of above (unboxing).
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
