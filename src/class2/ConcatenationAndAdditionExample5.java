package class2;

public class ConcatenationAndAdditionExample5 {
    public static void main(String[] args) {
        // Concatenation using +
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Addition using +
        int num1 = 10;
        int num2 = 20;
        int sum = num1 + num2;
        System.out.println("Sum: " + sum);

        // Concatenation and addition in the same expression
        String message = "The sum of " + num1 + " and " + num2 + " is " + (num1 + num2);
        System.out.println(message);
    }
}
