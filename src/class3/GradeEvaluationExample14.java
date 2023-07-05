package class3;

import java.util.Scanner;

public class GradeEvaluationExample14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your test score: ");
        int score = scanner.nextInt();

        String result = (score >= 60) ? "Pass" : "Fail";

        System.out.println("Result: " + result);

        scanner.close();
    }
}
