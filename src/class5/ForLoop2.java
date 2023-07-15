package class5;

import java.util.Scanner;

public class ForLoop2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of iterations: ");
        int iterations = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= iterations; i=i+2) {
            System.out.println("Iteration: " + i);
            // Perform some operation for each iteration
        }
    }
}
