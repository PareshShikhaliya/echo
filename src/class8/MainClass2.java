package class8;

public class MainClass2 {

    public static void main(String[] args) {
        int num = 5;

        // Call the static method to display the square of the number
        displaySquare(num);
    }

    // Static method with an argument (number) and no return type
    public static void displaySquare(int number) {
        int square = number * number;
        System.out.println("The square of " + number + " is: " + square);
    }
}
