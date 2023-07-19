package class7;

import java.util.Scanner;

public class StudentGradeAnalyzer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        // Create arrays to store student names and grades
        String[] studentNames = new String[numStudents];
        double[] studentGrades = new double[numStudents];

        // Input student names and grades
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter the name of student " + (i + 1) + ": ");
            studentNames[i] = scanner.nextLine();

            System.out.print("Enter the grade of student " + (i + 1) + ": ");
            studentGrades[i] = scanner.nextDouble();
            scanner.nextLine(); // Consume newline character
        }

        // Calculate average grade
        double sum = 0;
        for (double grade : studentGrades) {
            sum += grade;
        }
        double averageGrade = sum / numStudents;

        // Find highest and lowest grades
        double highestGrade = studentGrades[0];
        double lowestGrade = studentGrades[0];
        for (double grade : studentGrades) {
            if (grade > highestGrade) {
                highestGrade = grade;
            }
            if (grade < lowestGrade) {
                lowestGrade = grade;
            }
        }

        // Print analysis results
        System.out.println("\nGrade Analysis Results");
        System.out.println("----------------------");
        System.out.println("Average Grade: " + averageGrade);
        System.out.println("Highest Grade: " + highestGrade);
        System.out.println("Lowest Grade: " + lowestGrade);

        // Check if any student is on the honor roll (average grade >= 90)
        boolean honorRoll = false;
        for (double grade : studentGrades) {
            if (grade >= 90) {
                honorRoll = true;
                break;
            }
        }

        if (honorRoll) {
            System.out.println("Honor Roll Status: Yes");
        } else {
            System.out.println("Honor Roll Status: No");
        }

        scanner.close();
    }
}
