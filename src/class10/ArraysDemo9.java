package class10;

import java.util.Arrays;

public class ArraysDemo9 {

    public static void main(String[] args) {
        // One-dimensional array
        int[] numbers = {5, 2, 8, 1, 3};

        // Using Arrays.toString()
        System.out.println("One-dimensional array:");
        System.out.println(Arrays.toString(numbers));

        // Using Arrays.sort()
        Arrays.sort(numbers);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(numbers));

        // Using Arrays.fill()
        int[] filledArray = new int[5];
        Arrays.fill(filledArray, 10);
        System.out.println("Filled array:");
        System.out.println(Arrays.toString(filledArray));

        // Using Arrays.copyOf()
        int[] copiedArray = Arrays.copyOf(numbers, 3);
        System.out.println("Copied array:");
        System.out.println(Arrays.toString(copiedArray));

        // Using Arrays.copyOfRange()
        int[] copiedRangeArray = Arrays.copyOfRange(numbers, 1, 4);
        System.out.println("Copied range array:");
        System.out.println(Arrays.toString(copiedRangeArray));

        // Using Arrays.equals()
        int[] numbersCopy = {5, 2, 8, 1, 3};
        boolean areEqual = Arrays.equals(numbers, numbersCopy);
        System.out.println("Are the arrays equal? " + areEqual);

        // Multidimensional array
        int[][] matrix1 = {{1, 2}, {3, 4}};
        int[][] matrix2 = {{1, 2}, {3, 4}};

        // Using Arrays.deepToString()
        System.out.println("Multidimensional array:");
        System.out.println(Arrays.deepToString(matrix1));

        // Using Arrays.deepEquals()
        boolean areArraysEqual = Arrays.deepEquals(matrix1, matrix2);
        System.out.println("Are the multidimensional arrays equal? " + areArraysEqual);
    }
}
