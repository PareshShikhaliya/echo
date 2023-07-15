package class6;

public class StudentScores6 {
    public static void main(String[] args) {
        // Declare and initialize an array to store test scores of students
        int[] testScores = {78, 92, 85, 88, 90};

        // Accessing elements of the array
        System.out.println("Test score of the first student: " + testScores[0]);
        System.out.println("Test score of the third student: " + testScores[2]);

        // Calculating average test score
        int totalScore = 0;
        for (int i = 0; i < testScores.length; i++) {
            totalScore += testScores[i];
        }
        double averageScore = (double) totalScore / testScores.length;
        System.out.println("Average test score: " + averageScore);

        // Finding the highest test score
        int highestScore = Integer.MIN_VALUE;
        for (int score : testScores) {
            if (score > highestScore) {
                highestScore = score;
            }
        }
        System.out.println("Highest test score: " + highestScore);
    }
}
