package class5;

import java.util.Scanner;

public class BreakStatement6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the target number: ");
        int targetNumber = scanner.nextInt();

        for (int number = 1; number <= 100; number++) {
            if (number == targetNumber) {
                System.out.println("Target number found: " + targetNumber);
                break;
            }
            System.out.println("Checking number: " + number);
        }
        System.out.print("Enter the target number: ");
        scanner.close();
    }
}


