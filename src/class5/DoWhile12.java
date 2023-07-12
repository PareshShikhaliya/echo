package class5;

import java.util.Scanner;

public class DoWhile12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int secretNumber = 42;

        do {
            System.out.print("Guess the secret number (1-100): ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the secret number.");
            }
        } while (guess != secretNumber);

        scanner.close();
    }
}
