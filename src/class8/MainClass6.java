package class8;

public class MainClass6 {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        // Call the method to modify the array
        modifyArray(numbers);

        // Print the modified array after the method call
        System.out.println("Modified array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    // Method that modifies the array by squaring each element
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
    }
}
