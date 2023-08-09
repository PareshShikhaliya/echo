package class13;

public class StaticBlockExample7 {
    private static int staticVar;

    static {
        // This is a static block
        System.out.println("Static block is executed during class loading.");
        staticVar = 42; // Initializing static variable
    }

    public static void main(String[] args) {
        System.out.println("Main method is executed.");
        System.out.println("Value of staticVar: " + staticVar);
    }
}
