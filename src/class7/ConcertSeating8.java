package class7;

public class ConcertSeating8 {
    public static void main(String[] args) {
        // Create a jagged array to represent the seating arrangement
        String[][] seating = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"},
                {"D1", "D2", "D3"}
        };

        // Accessing and printing the values in the jagged array
        for (int i = 0; i < seating.length; i++) {
            for (int j = 0; j < seating[i].length; j++) {
                System.out.print(seating[i][j] + " ");
            }
            System.out.println();
        }
    }
}

