package class5;

public class ForLoop3 {
    public static void main(String[] args) {
        String message = "Hello, World!";

        for (int i = 1; i < message.length(); i++) {
            char character = message.charAt(i);
            System.out.println("Character at index " + i + ": " + character);
            // Perform some operation with each character
        }
    }
}
