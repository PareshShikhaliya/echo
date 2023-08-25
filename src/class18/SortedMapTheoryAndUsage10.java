package class18;

import java.util.*;

public class SortedMapTheoryAndUsage10 {
    public static void main(String[] args) {
        // Using SortedMap reference
        SortedMap<String, Integer> sortedMap = new TreeMap<>();
        sortedMap.put("Apple", 3);
        sortedMap.put("Banana", 2);
        sortedMap.put("Cherry", 5);
        sortedMap.put("Grape", 4);

        // Using subMap method to get entries in a range of keys
        SortedMap<String, Integer> subMap = sortedMap.subMap("Apple", "Cherry");

        // Displaying SortedMap entries
        System.out.println("Using SortedMap reference:");
        System.out.println("SortedMap entries:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Displaying subMap entries
        System.out.println("\nUsing subMap:");
        System.out.println("SubMap entries (from Apple to Cherry):");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }


        // Using Map reference
        Map<String, Integer> map = new TreeMap<>();
        map.put("Grape", 4);
        map.put("Apple", 3);
        map.put("Banana", 2);

        // Displaying Map entries
        System.out.println("\nUsing Map reference:");
        System.out.println("Map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
