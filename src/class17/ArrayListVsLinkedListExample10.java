package class17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedListExample10 {
    public static void main(String[] args) {
        int numElements = 100000; // Number of elements

        // ArrayList performance test
        List<String> arrayList = new ArrayList<>();
        long startTime = System.nanoTime();

        for (int i = 0; i < numElements; i++) {
            arrayList.add("Element " + i);
        }
        long endTime = System.nanoTime();
        long arrayListAddTime = endTime - startTime;

        // LinkedList performance test
        List<String> linkedList = new LinkedList<>();
        startTime = System.nanoTime();

        for (int i = 0; i < numElements; i++) {
            linkedList.add("Element " + i);
        }
        endTime = System.nanoTime();
        long linkedListAddTime = endTime - startTime;

        // Random access performance test
        int randomIndex = numElements / 2;

        startTime = System.nanoTime();
        String valueFromArrayList = arrayList.get(randomIndex);
        endTime = System.nanoTime();
        long arrayListAccessTime = endTime - startTime;

        startTime = System.nanoTime();
        String valueFromLinkedList = linkedList.get(randomIndex);
        endTime = System.nanoTime();
        long linkedListAccessTime = endTime - startTime;

        // Insertion in the middle performance test
        startTime = System.nanoTime();
        arrayList.add(randomIndex, "Inserted Element");
        endTime = System.nanoTime();
        long arrayListInsertTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.add(randomIndex, "Inserted Element");
        endTime = System.nanoTime();
        long linkedListInsertTime = endTime - startTime;

        // Removal from the middle performance test
        startTime = System.nanoTime();
        arrayList.remove(randomIndex);
        endTime = System.nanoTime();
        long arrayListRemoveTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.remove(randomIndex);
        endTime = System.nanoTime();
        long linkedListRemoveTime = endTime - startTime;

        System.out.println("Adding " + numElements + " elements:");

        System.out.println("ArrayList add time: " + arrayListAddTime + " nanoseconds");
        System.out.println("LinkedList add time: " + linkedListAddTime + " nanoseconds");

        System.out.println("\nAccessing an element at index " + randomIndex + ":");

        System.out.println("ArrayList access time: " + arrayListAccessTime + " nanoseconds");
        System.out.println("LinkedList access time: " + linkedListAccessTime + " nanoseconds");

        System.out.println("\nInserting element in the middle:");

        System.out.println("ArrayList insert time: " + arrayListInsertTime + " nanoseconds");
        System.out.println("LinkedList insert time: " + linkedListInsertTime + " nanoseconds");

        System.out.println("\nRemoving element from the middle:");

        System.out.println("ArrayList remove time: " + arrayListRemoveTime + " nanoseconds");
        System.out.println("LinkedList remove time: " + linkedListRemoveTime + " nanoseconds");
    }
}
