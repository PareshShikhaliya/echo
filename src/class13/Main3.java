package class13;

// Define a class named Example
class Example {
    // Declare a static variable named staticVariable
    static int staticVariable = 10;

    // This is a static initializer block.
    // It will be executed when the class is loaded into memory.
    // It's used here to print a message when the staticVariable is being initialized.
    static {
        System.out.println("Static variable is being initialized.");
    }
}

// Main class to demonstrate when static variables are loaded
public class Main3 {
    public static void main(String[] args) {
        System.out.println("Program started.");

        // Create two instances of the Example class.
        // However, creating instances doesn't trigger the static initializer block.
        Example example1 = new Example();
        System.out.println("Program in middle of execution.");

        Example example2 = new Example();

        System.out.println("Program ended.");
    }
}
