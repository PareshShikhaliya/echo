package class8;

public class MainClass8 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Before method call:");
        printArray(numbers);

        // Call the method with a copy of the array
        int[] copiedNumbers = copyArray(numbers);
        modifyArray(copiedNumbers);

        System.out.println("After method call:");
        printArray(numbers);
    }

    // Method that makes a copy of the array and returns it
    public static int[] copyArray(int[] arr) {
        int[] copy = new int[arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        return copy;
    }

    // Method that modifies the array by adding 1 to each element
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    // Method to print the elements of the array
    public static void printArray(int[] arr) {
        for (int number : arr) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
