package class5;


public class NestedForLoop13 {
    public static void main(String[] args) {
        int rows = 4;
        int columns = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                int product = i * j;
                System.out.print(product + "\t");
            }
            System.out.println();
        }
    }
}

