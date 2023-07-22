package class8;

public class MainClass3 {

    public static void main(String[] args) {
        int num = 5;

        // Call the static method to get the square of the number
        int square = calculateSquare(num);
        System.out.println("The square of " + num + " is: " + square);
    }

    // Static method with an argument (number) and a return type (int)
    public static int calculateSquare(int number) {
        return number * number;
    }
}
