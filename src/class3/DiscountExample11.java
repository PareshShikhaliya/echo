package class3;

import java.util.Scanner;

public class DiscountExample11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total purchase amount: $");
        double totalAmount = scanner.nextDouble();

        System.out.print("Are you a premium member? (yes/no): ");
        String isPremiumMember = scanner.next();

        if (totalAmount > 100 || isPremiumMember.equalsIgnoreCase("yes")) {
            System.out.println("You are eligible for a discount!");
        } else {
            System.out.println("Sorry, no discount available.");
        }

        scanner.close();
    }
}
