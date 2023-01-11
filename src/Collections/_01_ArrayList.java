package Collections;
import java.util.ArrayList;
import java.util.Collections;
public class _01_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> alist = new ArrayList<>();
        alist.add(1);
        alist.add(4);
        alist.add(2);
        System.out.println("Initial ArrayList: " + alist);

        // Adding element at Start:
        alist.add(0, 3);
        System.out.println("Updated ArrayList: " + alist);

        // Changing element value:
        alist.set(2, 9); // alist.set(index, element);
        System.out.println("Updated ArrayList: " + alist);

        // Element at index 1:
        System.out.println("Element at index 1: " + alist.get(1));

        // Removing an element:
        alist.remove(1);
        System.out.println("After removing 1 from index 1: " + alist);
        System.out.println("Size of ArrayList: " + alist.size());

        // Loops in ArrayList:
        for(int i = 0 ; i < alist.size() ; i++)
            System.out.print(alist.get(i) + " ");
        System.out.println();

        // Sorting ArrayList:
        Collections.sort(alist);
        System.out.println("ArrayList after sorting: " + alist);

        ArrayList<String> slist = new ArrayList<>();
        slist.add("Hello, my name is Aditya");
        slist.add("Bye.");
        System.out.println("Strings in ArrayList: " + slist);

        // Removing all elements:
        slist.removeAll(slist);
        System.out.println("After removing all elements from ArrayList: " + slist);

    }
}
