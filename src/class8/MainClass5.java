package class8;

public class MainClass5 {

    public static void main(String[] args) {
        int numInt = 5;
        double numDouble = 2.5;

        // Call the overloaded methods with different types, numbers, and orders of arguments
        calculateSquare(numInt);
        calculateSquare(numDouble);

        int num1 = 5;
        int num2 = 10;
        int num3 = 15;
        int sumTwo = calculateSum(num1, num2);
        int sumThree = calculateSum(num1, num2, num3);

        System.out.println("The square of " + numInt + " is: " + calculateSquare(numInt));
        System.out.println("The square of " + numDouble + " is: " + calculateSquare(numDouble));
        System.out.println("Sum of two numbers: " + sumTwo);
        System.out.println("Sum of three numbers: " + sumThree);

        calculateArea(3, 4.5);
        calculateArea(5.0d, 2);
    }

    // Method overloading based on the type of argument

    public static int calculateSquare(int number) {
        return number * number;
    }

    public static double calculateSquare(double number) {
        return number * number;
    }

    // Method overloading based on the number of arguments

    public static int calculateSum(int number1, int number2) {
        return number1 + number2;
    }

    public static int calculateSum(int number1, int number2, int number3) {
        return number1 + number2 + number3;
    }

    // Method overloading based on the order of arguments

    public static void calculateArea(int length, double width) {
        double area = length * width;
        System.out.println("The area of the rectangle is: " + area);
    }

    public static void calculateArea(double base, int height) {
        double area = 0.5 * base * height;
        System.out.println("The area of the triangle is: " + area);
    }

}

