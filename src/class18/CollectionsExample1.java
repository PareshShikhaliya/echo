package class18;

import java.util.*;

public class CollectionsExample1 {
    public static void main(String[] args) {
        // min() and max() Methods: Finding the minimum and maximum elements in a collection
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);
        int min = Collections.min(numbers); // Find the minimum element
        int max = Collections.max(numbers); // Find the maximum element
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        // frequency() Method: Counting occurrences of a specific element in a collection
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "apple");
        int frequency = Collections.frequency(words, "apple"); // Count occurrences of "apple"
        System.out.println("Frequency of 'apple': " + frequency);

        // binarySearch() Method: Searching for an element in a sorted collection
        List<Integer> sortedNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int index = Collections.binarySearch(sortedNumbers, 5); // Search for index of 5
        System.out.println("Index of 5: " + index);

        // disjoint() Method: Checking if two collections have common elements
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        List<String> list2 = Arrays.asList("orange", "grape", "kiwi");
        boolean isDisjoint = Collections.disjoint(list1, list2); // Check for common elements
        System.out.println("Are lists disjoint? " + isDisjoint);

        // reverse() Method: Reversing the order of elements in a list
        List<Integer> reverseNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.reverse(reverseNumbers); // Reverse the order
        System.out.println("Reversed list: " + reverseNumbers);

        // sort() Method: Sorting elements in ascending order
        List<Integer> unsortedNumbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));
        Collections.sort(unsortedNumbers); // Sort in ascending order
        System.out.println("Sorted list: " + unsortedNumbers);

        // rotate() Method: Cyclically shifting elements in a list
        List<Integer> rotateNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.rotate(rotateNumbers, 2); // Rotate elements by 2 positions
        System.out.println("Rotated list: " + rotateNumbers);

        // shuffle() Method: Randomly shuffling elements in a list
        List<Integer> shuffleNumbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        Collections.shuffle(shuffleNumbers); // Shuffle elements randomly
        System.out.println("Shuffled list: " + shuffleNumbers);
    }
}

