package class3;

import java.util.Scanner;

public class PasswordValidationExample12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (!username.isEmpty() && !password.isEmpty()) {
            if (password.length() >= 8 && !password.contains(username)) {
                System.out.println("Password is valid.");
            } else {
                System.out.println("Password is invalid.");
            }
        } else {
            System.out.println("Username and password are required.");
        }

        scanner.close();
    }
}
