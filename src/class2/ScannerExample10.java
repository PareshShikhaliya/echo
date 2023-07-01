package class2;

import java.util.Scanner;

public class ScannerExample10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read integer
        System.out.print("Enter an integer: ");
        int intValue = scanner.nextInt();
        System.out.println("Integer value: " + intValue);

        // Read double
        System.out.print("Enter a double: ");
        double doubleValue = scanner.nextDouble();
        System.out.println("Double value: " + doubleValue);

        // Read boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean booleanValue = scanner.nextBoolean();
        System.out.println("Boolean value: " + booleanValue);

        // Read string
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter a string: ");
        String stringValue = scanner.nextLine();
        System.out.println("String value: " + stringValue);

        scanner.close();
    }
}
