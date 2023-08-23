package class17;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapVsHashMapExample8 {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, String> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("apple", "A fruit");
        hashMap.put("banana", "A yellow fruit");
        hashMap.put("grape", "A small, round fruit");

        System.out.println("HashMap - Insertion Order Not Guaranteed:");
        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("-------------------------------------------");

        // Creating a TreeMap
        Map<String, String> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("apple", "A fruit");
        treeMap.put("banana", "A yellow fruit");
        treeMap.put("grape", "A small, round fruit");

        System.out.println("TreeMap - Keys are Sorted in Natural Order:");
        for (Map.Entry<String, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
