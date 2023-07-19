package class7;

import java.util.Arrays;

public class ArrayMethodsExample12 {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 4, 1};

        // toString method
        String numbersString = Arrays.toString(numbers);
        System.out.println("Array as string: " + numbersString);

        // deepToString method
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        String matrixString = Arrays.deepToString(matrix);
        System.out.println("Matrix as string: " + matrixString);

        // equals method
        int[] numbersCopy = {5, 2, 8, 4, 1};
        boolean areEqual = Arrays.equals(numbers, numbersCopy);
        System.out.println("Arrays are equal: " + areEqual);

        // fill method
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array: " + Arrays.toString(filledArray));

        // sort method
        int[] unsortedArray = {5, 2, 8, 4, 1};
        Arrays.sort(unsortedArray);
        System.out.println("Sorted array: " + Arrays.toString(unsortedArray));

        // binarySearch method
        int[] sortedArray = {1, 2, 4, 5, 8};
        int index = Arrays.binarySearch(sortedArray, 4);
        System.out.println("Index of 4: " + index);
    }
}
