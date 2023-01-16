package ApniKaksha;

import java.util.HashSet;

// To perform iteration in HashSet, we need to include Iterator.
import java.util.Iterator;

// Why do we use HashSet ?
// -> It is because it takes O(1) time to add, remove or search for any element which is not possible in array. Duplicate elements not allowed.
public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();

        // Inserting element:

        hset.add(10);
        hset.add(20);
        hset.add(30);
        hset.add(12);
        hset.add(25);

        // Searching for the element:

        System.out.println(hset.contains(10)); // Will return true.
        System.out.println(hset.contains(90)); // Will return false.

        // Size of HashSet:
        System.out.println(hset.size());

        // Print all elements:
        System.out.println(hset);

        // Using Iterator:
        Iterator it = hset.iterator();

        // next()

        System.out.println(it.next()); // 1st element
        System.out.println(it.next()); // 2nd element
        System.out.println(it.next()); // 3rd element
        System.out.println(it.next()); // 4th element

        // hasNext() returns boolean value.

        System.out.println(it.hasNext()); // checks for 5th element, and prints true/false.

        System.out.println(it.next()); // 5th element reached.

        System.out.println(it.hasNext()); // checks for next/6th element, hence returns false as no element present.
    }
}
