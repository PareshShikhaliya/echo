package class8;
 class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return num1 / num2;
    }
}

public class MainClass10 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int num1 = 10;
        int num2 = 5;

        int sum = calculator.add(num1, num2);
        int difference = calculator.subtract(num1, num2);
        int product = calculator.multiply(num1, num2);

        System.out.println("Num1 + Num2 = " + sum);
        System.out.println("Num1 - Num2 = " + difference);
        System.out.println("Num1 * Num2 = " + product);

        try {
            int quotient = calculator.divide(num1, num2);
            System.out.println("Num1 / Num2 = " + quotient);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
