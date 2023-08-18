package class16;

import java.util.*;

public class IteratorForEachExample5 {
    public static void main(String[] args) {
        // List example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        System.out.println("Iterating over List using Iterator:");
        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            System.out.println(element);
        }

        System.out.println("\nIterating over List using for-each loop:");
        for (String element : list) {
            System.out.println(element);
        }

        // Set example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Orange");

        System.out.println("\nIterating over Set using Iterator:");
        Iterator<String> setIterator = set.iterator();
        while (setIterator.hasNext()) {
            String element = setIterator.next();
            System.out.println(element);
        }

        System.out.println("\nIterating over Set using for-each loop:");
        for (String element : set) {
            System.out.println(element);
        }
    }
}
