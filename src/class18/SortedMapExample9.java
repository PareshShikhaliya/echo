package class18;

import java.util.*;

public class SortedMapExample9 {
    public static void main(String[] args) {
        // Creating a SortedMap (TreeMap)
        SortedMap<String, Integer> sortedMap = new TreeMap<>();

        // Adding elements
        sortedMap.put("Apple", 3);
        sortedMap.put("Banana", 2);
        sortedMap.put("Cherry", 5);
        sortedMap.put("Grape", 4);
        sortedMap.put("Orange", 4);

        // Displaying sorted entries based on keys
        System.out.println("SortedMap entries:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting first key and value
        String firstKey = sortedMap.firstKey();
        int firstValue = sortedMap.get(firstKey);
        System.out.println("\nFirst Key: " + firstKey + ", First Value: " + firstValue);

        // Getting last key and value
        String lastKey = sortedMap.lastKey();
        int lastValue = sortedMap.get(lastKey);
        System.out.println("Last Key: " + lastKey + ", Last Value: " + lastValue);

        // Finding submap within a range of keys
        SortedMap<String, Integer> subMap = sortedMap.subMap("Banana", "Grape");
        System.out.println("\nSubMap entries (Banana to Grape):");
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting entries less than a key
        SortedMap<String, Integer> headMap = sortedMap.headMap("Cherry");
        System.out.println("\nHeadMap entries (Less than Cherry):");
        for (Map.Entry<String, Integer> entry : headMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Getting entries greater than or equal to a key
        SortedMap<String, Integer> tailMap = sortedMap.tailMap("Cherry");
        System.out.println("\nTailMap entries (Cherry and beyond):");
        for (Map.Entry<String, Integer> entry : tailMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
