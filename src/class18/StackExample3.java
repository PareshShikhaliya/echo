package class18;

import java.util.*;

public class StackExample3 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");

        // Accessing the top element
        String topElement = stack.peek(); // Does not remove the element
        System.out.println("Top element: " + topElement);

        // Popping elements from the stack
        String poppedElement = stack.pop(); // Removes and returns the top element
        System.out.println("Popped element: " + poppedElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Pushing more elements onto the stack
        stack.push("Grape");
        stack.push("Orange");

        // Size of the stack
        int size = stack.size();
        System.out.println("Stack size: " + size);

        // Iterating through the stack
        System.out.print("Stack elements: ");
        for (String item : stack) {
            System.out.print(item + " ");
        }
        System.out.println();

        // Search for an element in the stack
        int position = stack.search("Banana"); // Returns distance from the top
        System.out.println("Position of 'Banana': " + position);
    }
}
