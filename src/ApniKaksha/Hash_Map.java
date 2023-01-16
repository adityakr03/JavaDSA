package ApniKaksha;

import java.util.*;

// HashMaps are unordered map, i.e. order of insertion is not preserved.
public class Hash_Map {
    public static void main(String[] args) {
        HashMap<String, Integer> hmap = new HashMap<>();
        // HashMap<key, value> hashmap = new HashMap<key, value>();
        // HashMap<Integer, Integer> hms = new HashMap<>(); can also be used.

        // Adding key-value pairs to HashMap:

        hmap.put("Aditya", 26);
        hmap.put("Ayushi", 04);
        hmap.put("Shruti", 27);

        // Printing the HashMap:
        System.out.println("Original HashMap: " + hmap);

        // Updating the HashMap:
        hmap.put("Aditya", 03);

        // Printing the HashMap:
        System.out.println("HashMap After Updation: " + hmap);

        // Searching by key:

        System.out.println(hmap.containsKey("Shruti")); // Will return true
        System.out.println(hmap.containsKey("Shrutiya")); // Will return false

        // Getting the value by key:

        System.out.println(hmap.get("Aditya")); // Will return 3
        System.out.println(hmap.get("Aditi")); // Will return null

        // Foreach loop in HashMap:
        // for(int x: arr)

        for(Map.Entry<String, Integer> x : hmap.entrySet())
            System.out.println(x.getKey() + " : " + x.getValue());

        // Another way by converting the HashMap into set:

        Set<String> keys = hmap.keySet();
        for(String key : keys)
            System.out.println(key + " : " + hmap.get(key));

        // Removing key-value pairs from the HashMap:
        
        hmap.remove("Shruti");
        System.out.println("HashMap After Removal of Shruti: " + hmap);
    }
}