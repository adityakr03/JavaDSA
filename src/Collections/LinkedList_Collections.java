package Collections;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList_Collections {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("World");
        list.addFirst("Hello");
        System.out.println("List: " + list +", Size of list: " + list.size());
        for(int i = 0 ; i < list.size() ; i++)
            System.out.println(list.get(i));
        list.removeFirst();
        System.out.println(list);
        list.addFirst("Byye");
        list.removeAll(list);
        System.out.println(list);
    }
}
