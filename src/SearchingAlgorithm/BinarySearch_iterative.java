package SearchingAlgorithm;

public class BinarySearch_iterative {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int h = arr.length - 1;
        int l = 0;
        int x = 4;
        bs b = new bs();
        int result = b.search(arr, l, h, x);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found.");
    }

    static class bs {
        int search(int[] arr, int l, int h, int x) {
            while (l <= h) {
                int mid = l + (h - l) / 2;
                if (arr[mid] == x) return mid;
                if (arr[mid] < x) l = mid + 1;
                else h = mid - 1;
            }
            return -1;
        }
    }
}
