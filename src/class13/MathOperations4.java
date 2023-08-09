package class13;

public class MathOperations4 {
    // Static method to add two numbers
    public static int add(int a, int b) {
        return a + b;
    }

    // Static method to subtract two numbers
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Static method to multiply two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Static method to divide two numbers
    public static double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Cannot divide by zero");
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        int sum = MathOperations4.add(num1, num2);
        int difference = MathOperations4.subtract(num1, num2);
        int product = MathOperations4.multiply(num1, num2);
        double quotient = MathOperations4.divide(num1, num2);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
}

