package class5;


import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Enter a series of strings (enter 'quit' to exit):");
        while (true) {
            System.out.print("String: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            System.out.println("You entered: " + input);
        }

        System.out.println("Loop terminated. Exiting program.");
        scanner.close();
    }
}
