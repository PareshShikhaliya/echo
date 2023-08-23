package class17;

import java.util.LinkedList;

public class LinkedListExample9 {
    public static void main(String[] args) {
        // Creating a LinkedList of integers
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the end of the list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        // Adding an element at a specific index
        linkedList.add(1, 15);

        // Printing the linked list
        System.out.println("Linked List: " + linkedList);

        // Getting elements by index
        int value = linkedList.get(2);
        System.out.println("Element at index 2: " + value);

        // Removing an element by value
        linkedList.remove(Integer.valueOf(20));

        // Printing the updated linked list
        System.out.println("Updated Linked List: " + linkedList);

        // Iterating through the linked list
        System.out.println("Iterating through the linked list:");
        for (int num : linkedList) {
            System.out.println(num);
        }

        // Checking if the linked list is empty
        boolean isEmpty = linkedList.isEmpty();
        System.out.println("Is the linked list empty? " + isEmpty);

        // Getting the size of the linked list
        int size = linkedList.size();
        System.out.println("Size of the linked list: " + size);
    }
}
