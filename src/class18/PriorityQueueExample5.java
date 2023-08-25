package class18;

import java.util.*;

public class PriorityQueueExample5 {
    public static void main(String[] args) {
        // Creating a priority queue with natural ordering
        PriorityQueue<Integer> naturalPriorityQueue = new PriorityQueue<>();

        // Adding elements
        naturalPriorityQueue.add(30);
        naturalPriorityQueue.add(10);
        naturalPriorityQueue.add(20);

        // Displaying elements (ordered by natural ordering)
        System.out.println("Natural PriorityQueue elements: " + naturalPriorityQueue);

        // Creating a priority queue with a custom comparator
        PriorityQueue<Integer> customPriorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        // Adding elements
        customPriorityQueue.add(30);
        customPriorityQueue.add(10);
        customPriorityQueue.add(20);

        // Displaying elements (ordered by reverse ordering)
        System.out.println("Custom PriorityQueue elements: " + customPriorityQueue);

        // Polling elements (removing the highest-priority element)
        int highestPriority = naturalPriorityQueue.poll();
        System.out.println("Highest-priority element: " + highestPriority);

        // Peek at the highest-priority element without removing it
        int peekedElement = customPriorityQueue.peek();
        System.out.println("Peeked element: " + peekedElement);
    }
}
