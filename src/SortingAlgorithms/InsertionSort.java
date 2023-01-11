package SortingAlgorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 4, 6, 3, 8, 5, 7, 0};
        int i, j;
        for (i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > temp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = temp;
        }
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}