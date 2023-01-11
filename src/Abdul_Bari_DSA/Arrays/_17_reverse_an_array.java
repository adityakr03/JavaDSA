package Abdul_Bari_DSA.Arrays;

public class _17_reverse_an_array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] rev = new int[arr.length]; // Using another array to store the reversed array, then copy back the reversed array content to original array.
        System.out.println("Original Array elements order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\tElement at position " + i + ": " + arr[i]);
        }
        // Reversing array using temporary array.
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            rev[i] = arr[j];
        }
        // Copying reversed elements into the original array.
        System.arraycopy(rev, 0, arr, 0, arr.length);
        System.out.println("Reversed Array elements order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("\tElement at position " + i + ": " + arr[i]);
        }
    }
}
