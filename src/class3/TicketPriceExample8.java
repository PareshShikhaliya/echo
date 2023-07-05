package class3;

import java.util.Scanner;

public class TicketPriceExample8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (yes/no): ");
        String isStudent = scanner.next();

        if (age >= 18) {
            if (isStudent.equalsIgnoreCase("yes")) {
                System.out.println("Ticket price: $8");
            } else {
                System.out.println("Ticket price: $12");
            }
        } else {
            System.out.println("Ticket price: $6");
        }

        scanner.close();
    }
}
