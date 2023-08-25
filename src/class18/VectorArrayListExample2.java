package class18;

import java.util.*;

public class VectorArrayListExample2 {
    public static void main(String[] args) {
        // Using Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(20);
        vector.add(30);

        // Using ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        // Accessing elements
        System.out.println("Vector elements: " + vector);
        System.out.println("ArrayList elements: " + arrayList);

        // Adding elements
        vector.addElement(40); // Equivalent to vector.add(40)
        arrayList.add(40);

        // Size of the collections
        System.out.println("Vector size: " + vector.size());
        System.out.println("ArrayList size: " + arrayList.size());

        // Removing elements
        vector.removeElement(20); // Removes the first occurrence of 20
        arrayList.remove(Integer.valueOf(20)); // Removes the first occurrence of 20

        // Iterating through the collections
        System.out.print("Vector elements: ");
        for (Integer num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("ArrayList elements: ");
        for (Integer num : arrayList) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Differences between Vector and ArrayList
        // - Vector is synchronized (thread-safe), while ArrayList is not.
        // - Vector's methods are synchronized, impacting performance in multi-threaded scenarios.
        // - Vector has the addElement(), elementAt(), and removeElement() methods.
        // - ArrayList is more efficient for most use cases due to lack of synchronization.
        // - ArrayList can be more suitable for single-threaded environments.
        // - Both provide similar dynamic array functionality.
    }
}
