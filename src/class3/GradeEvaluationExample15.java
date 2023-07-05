package class3;

import java.util.Scanner;

public class GradeEvaluationExample15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scanner.nextInt();

        // Using if statement
        if (score >= 60) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // Using ternary operator
        String result = (score >= 60) ? "Pass" : "Fail";
        System.out.println("Result: " + result);

        scanner.close();
    }
}
