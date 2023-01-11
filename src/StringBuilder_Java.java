public class StringBuilder_Java {

    /* Why do we use StringBuilder?
     -> Since String keyword is immutable, and strings created using it, occupies space in heap memory, and
      each time, we change something in string, a new duplicate string is created in the memory, hence it uses more memory and
      doing this also takes time , to prevent all this, we use StringBuilder as it just updates the original string instead of creating a new string as Strings created
      using StringBuilder are mutable(can be changed).
      */

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("This is string1. ");
        StringBuilder sb2 = new StringBuilder("This is string2. ");
        System.out.println(sb1);
        System.out.println(sb2);

        // To print char at index 0
        System.out.println(sb1.charAt(0));

        // To set character at any index
        sb2.setCharAt(15, '3');
        System.out.println(sb2);

        // To concatenate 2 strings
        // System.out.println(sb1+sb2); This is not applicable in StringBuilder.
        System.out.println(sb1.append(sb2));

        // Reverse a String.
        for (int i = 0; i < sb2.length() / 2; i++) {
            // Creating front and last points
            int front = i;
            int back = sb2.length() - 1 - i;

            // Picking the char from front and back.
            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);

            // Swapping front and back characters.
            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);
        }
        System.out.println(sb2);

        // If want to swap 2 numbers without any other variable:
        int a = 1, b = 2;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + ", " + b);
    }
}
