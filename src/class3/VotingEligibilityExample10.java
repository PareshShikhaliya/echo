package class3;

import java.util.Scanner;

public class VotingEligibilityExample10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a citizen? (yes/no): ");
        String isCitizen = scanner.next();

        System.out.print("Are you registered to vote? (yes/no): ");
        String isRegistered = scanner.next();

        if (age >= 18 && isCitizen.equalsIgnoreCase("yes") && isRegistered.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote.");
        }

        scanner.close();
    }
}
