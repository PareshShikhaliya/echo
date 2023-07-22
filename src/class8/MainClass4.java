package class8;

public class MainClass4 {

    public static void main(String[] args) {
        int numInt = 5;
        double numDouble = 2.5;

        // Call the overloaded methods to get the square of the numbers
        int squareInt = calculateSquare(numInt);
        double squareDouble = calculateSquare(numDouble);

        System.out.println("The square of " + numInt + " is: " + squareInt);
        System.out.println("The square of " + numDouble + " is: " + squareDouble);
    }

    // Overloaded method to calculate the square of an integer
    public static int calculateSquare(int number) {
        return number * number;
    }

    // Overloaded method to calculate the square of a double
    public static double calculateSquare(double number) {
        return number * number;
    }
}
