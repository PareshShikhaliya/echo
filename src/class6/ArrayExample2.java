package class6;



public class ArrayExample2 {
    public static void main(String[] args) {
        // Declare and initialize an array of strings
        String[] fruits = {"Apple", "Banana", "Orange"};

        // Accessing elements of the array
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("Second fruit: " + fruits[1]);
        System.out.println("Third fruit: " + fruits[2]);

        // Declare the array first
        String[] animals;
        // Initialize the array with specific size
        animals = new String[3];
        // Assign values to the elements individually
        animals[0] = "Lion";
        animals[1] = "Tiger";
        animals[2] = "Elephant";

        // Looping through the array
        System.out.println("All animals:");
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        // Declare the array without initialization
        int[] numbers = new int[5];
        // Assign values using a loop
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

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
