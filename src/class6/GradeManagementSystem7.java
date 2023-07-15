package class6;

import java.util.Scanner;

public class GradeManagementSystem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Create an array to store student grades
        int[] grades = new int[numStudents];

        // Input student grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextInt();
        }

        // Calculate average grade
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        double averageGrade = (double) sum / numStudents;

        // Find the highest grade
        int highestGrade = Integer.MIN_VALUE;
        for (int grade : grades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
        }

        // Find the lowest grade
        int lowestGrade = Integer.MAX_VALUE;
        for (int grade : grades) {
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        System.out.println("Average grade: " + averageGrade);
        System.out.println("Highest grade: " + highestGrade);
        System.out.println("Lowest grade: " + lowestGrade);

        // Check if any student failed (grade less than 40)
        boolean anyFailures = false;
        for (int grade : grades) {
            if (grade < 40) {
                anyFailures = true;
                break;
            }
        }

        if (anyFailures) {
            System.out.println("Some students have failed.");
        } else {
            System.out.println("All students have passed.");
        }
    }
}
