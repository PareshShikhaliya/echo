package class7;

public class ArrayPrintExample13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Enhanced for-each loop
        System.out.println("Using Enhanced For-each Loop:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Traditional for loop
        System.out.println("\nUsing Traditional For Loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
