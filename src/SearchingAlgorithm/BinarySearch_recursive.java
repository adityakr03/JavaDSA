package SearchingAlgorithm;

public class BinarySearch_recursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        // int x = 2;
        int x = 10;
        int h = arr.length - 1;
        binarySearch bs = new binarySearch();
        int result = bs.binarySearch(arr, 0, h, x);
        if (result != -1) System.out.println("Element found at index: " + result);
        else System.out.println("Element not found.");
    }

    static class binarySearch {
        int binarySearch(int[] arr, int l, int h, int x) {
            if (h >= l) {
                int mid = l + (h - l) / 2;
                if (arr[mid] == x) return mid;
                if (x < arr[mid]) return binarySearch(arr, l, mid - 1, x);
                    //if (x > arr[mid])
                else return binarySearch(arr, mid + 1, h, x);
            }
            return -1;
        }
    }
}
