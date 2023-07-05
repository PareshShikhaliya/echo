package class3;

import java.util.Scanner;

public class LoginValidationExample13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined username and password
        String correctUsername = "admin";
        String correctPassword = "password123";

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else if (!username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("Invalid username and password. Please try again.");
        } else if (!username.equals(correctUsername)) {
            System.out.println("Invalid username. Please try again.");
        } else {
            System.out.println("Invalid password. Please try again.");
        }

        scanner.close();
    }
}
