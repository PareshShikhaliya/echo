package class8;

public class MainClass9 {

    public static void main(String[] args) {
        final int[] numbers = { 1, 2, 3, 4, 5 };
       // numbers= new int[]{5, 8};

        System.out.println("Before method call:");
        printArray(numbers);

        // Call the method with the final array reference
        modifyArray(numbers);

        System.out.println("After method call:");
        printArray(numbers);
    }

    // Method that tries to modify the array
    public static void modifyArray(final int[] arr) {
        // The following line will cause a compilation error:
        // arr = new int[] { 10, 20, 30, 40, 50 };

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
