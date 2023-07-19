package class7;

public class StringMatrixExample3 {
    public static void main(String[] args) {
        // Create a 2D array to represent a matrix of strings
        String[][] matrix = {
                {"Hello", "World"},
                {"Java", "Programming"},
                {"India", "Asia"}
        };

        // Accessing and printing the values in the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
