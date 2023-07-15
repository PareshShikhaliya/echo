package class6;


public class ArrayExample3 {
    public static void main(String[] args) {
        // Declare the array first
        int[] numbers = new int[5];



        // Assign values to the elements individually
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Accessing elements of the array
        System.out.println("First number: " + numbers[0]);
        System.out.println("Second number: " + numbers[1]);
        System.out.println("Third number: " + numbers[2]);

        // Looping through the array
        System.out.println("All numbers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
