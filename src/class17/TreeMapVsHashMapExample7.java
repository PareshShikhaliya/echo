package class17;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapVsHashMapExample7 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put(3, "C");
        hashMap.put(1, "A");
        hashMap.put(2, "B");

        System.out.println("HashMap - Insertion Order Not Guaranteed:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("-------------------------------------------");

        // Creating a TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put(3, "C");
        treeMap.put(1, "A");
        treeMap.put(2, "B");

        System.out.println("TreeMap - Keys are Sorted in Natural Order:");
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
