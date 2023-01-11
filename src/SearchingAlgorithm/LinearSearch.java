package SearchingAlgorithm;

import java.util.Scanner;

//import static SearchingAlgorithm.LinearSearch.search.search;

public class LinearSearch {
    public static void main(String[] args) {
        System.out.print("Enter the length of array: ");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[sc.nextInt()];
        System.out.println("Enter the elements into the array: ");
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the element to search: ");
        int ele = sc.nextInt();
        search s = new search();
        int result = s.search(arr, ele);
        if (result != -1)
            System.out.println("Element found at position " + result + ".");
        else
            System.out.println("Element not found.");
    }

    static class search {
        public int search(int[] arr, int x) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == x)
                    return i;
            }
            return -1;
        }
    }
}
