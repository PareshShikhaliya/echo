package class7;

public class StudentGrades5 {
    public static void main(String[] args) {
        // Create a 2D array to represent student grades
        String[][] grades = {
                {"John", "Math", "Science", "English"},
                {"Amy", "History", "Math", "Geography"},
                {"Mark", "English", "Science", "Math"}
        };

        // Accessing and printing the student grades
        for (int i = 0; i < grades.length; i++) {
            String studentName = grades[i][0];
            System.out.println("Student: " + studentName);

            for (int j = 1; j < grades[i].length; j++) {
                String subject = grades[i][j];
                System.out.println("Subject: " + subject);
            }

            System.out.println();
        }
    }
}
