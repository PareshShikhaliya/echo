package class6;



public class ArrayExample1 {
    public static void main(String[] args) {
        // Declare and initialize an array of integers


        int[] numbers = {10, 2, 30, 4, 50,100,200};

        // Accessing elements of the array
        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying an element of the array
        numbers[3] = 40;
        System.out.println("Modified fourth element: " + numbers[3]);

        // Looping through the array
        System.out.println("All elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
