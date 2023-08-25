package class18;

import java.util.*;

public class HashTableVsHashMap8 {
    public static void main(String[] args) {
        // Using Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "One");
        hashtable.put(2, "Two");
        hashtable.put(3, "Three");

        // Using HashMap
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Displaying elements
        // Displaying elements
        System.out.println("Hashtable:");
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Differences between Hashtable and HashMap
        // - Hashtable is synchronized (thread-safe), while HashMap is not.
        // - Hashtable does not allow null keys or values, while HashMap does.
        // - Hashtable's methods are synchronized, impacting performance.
        // - HashMap is more efficient for most use cases due to lack of synchronization.
        // - Hashtable is considered legacy; prefer HashMap in new code.
    }
}
