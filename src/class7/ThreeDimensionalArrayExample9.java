package class7;

public class ThreeDimensionalArrayExample9 {
    public static void main(String[] args) {
        // Define the dimensions of the array
        int sizeX = 3;
        int sizeY = 4;
        int sizeZ = 2;

        // Initialize the array with values
        int[][][] myArray = {
                { {1, 2}, {3, 4}, {5, 6}, {7, 8} },
                { {9, 10}, {11, 12}, {13, 14}, {15, 16} },
                { {17, 18}, {19, 20}, {21, 22}, {23, 24} }
        };

        // Print the initialized array
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 4; y++) {
                for (int z = 0; z < 2; z++) {
                    System.out.print(myArray[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
