package class7;

public class CharGridExample2 {
    public static void main(String[] args) {
        // Create a 2D array to represent a grid of characters
        char[][] grid = {
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        // Accessing and printing the values in the array
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
