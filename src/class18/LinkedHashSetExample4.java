package class18;

import java.util.*;

public class LinkedHashSetExample4 {
    public static void main(String[] args) {
        // Using LinkedHashSet
        // LinkedHashSet maintains insertion order of elements.
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Banana"); // Duplicates are not allowed

        // Displaying elements in the order they were inserted
        System.out.println("LinkedHashSet elements: " + linkedHashSet);

        // Using HashSet
        // HashSet does not guarantee insertion order of elements.
        HashSet<String> hashSet = new HashSet<>();

        // Adding elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Banana"); // Duplicates are not allowed

        // Displaying elements (order not guaranteed)
        System.out.println("HashSet elements: " + hashSet);

        // Differences between LinkedHashSet and HashSet
        // - LinkedHashSet maintains insertion order using a doubly-linked list.
        // - HashSet does not guarantee any specific order; it uses a hash table.
        // - Both prevent duplicate elements.
        // - Use LinkedHashSet when order matters, and HashSet when order doesn't matter.
    }
}
