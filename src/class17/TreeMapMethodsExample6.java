package class17;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapMethodsExample6 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 95);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 90);

        // Getting a value using a key
        int aliceScore = studentScores.get("Alice");
        System.out.println("Alice's score: " + aliceScore);

        // Checking if the map contains a key
        boolean containsBob = studentScores.containsKey("Bob");
        System.out.println("Does the map contain Bob? " + containsBob);

        // Removing a key-value pair
        studentScores.remove("Charlie");

        // Getting the size of the map
        int mapSize = studentScores.size();
        System.out.println("Map size: " + mapSize);

        // Iterating through keys using keySet
        System.out.println("Keys in the map:");
        Set<String> keys = studentScores.keySet();
        for (String key : keys) {
            System.out.println("Key: " + key);
        }

        // Iterating through values
        System.out.println("Values in the map:");
        for (int value : studentScores.values()) {
            System.out.println("Value: " + value);
        }

        // Iterating through key-value pairs using entrySet
        System.out.println("Key-value pairs in the map:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Clearing the map
        studentScores.clear();
        System.out.println("Map cleared. Size: " + studentScores.size());
    }
}
