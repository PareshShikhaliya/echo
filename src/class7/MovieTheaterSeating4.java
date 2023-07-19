package class7;

public class MovieTheaterSeating4 {
    public static void main(String[] args) {
        // Create a 2D array to represent the seating arrangement
        String[][] theater = {
                {"A1", "A2", "A3", "A4"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4"},
                {"D1", "D2", "D3", "D4"}
        };

        // Print the seating arrangement
        for (int i = 0; i < theater.length; i++) {
            for (int j = 0; j < theater[i].length; j++) {
                System.out.print(theater[i][j] + " ");
            }
            System.out.println();
        }
    }
}
