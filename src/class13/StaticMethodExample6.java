package class13;

public class StaticMethodExample6 {
    private int instanceVar = 10;
    private static int staticVar = 20;

    // Instance method
    public void instanceMethod() {
        System.out.println("Instance Method: instanceVar = " + instanceVar);
        System.out.println("Instance Method: staticVar = " + staticVar);
    }

    // Static method
    public static void staticMethod() {
        // Uncommenting the following line will result in a compilation error
        // System.out.println("Static Method: instanceVar = " + instanceVar);

        System.out.println("Static Method: staticVar = " + staticVar);
    }

    public static void main(String[] args) {
        StaticMethodExample6 instance = new StaticMethodExample6();

        // Calling instance method
        instance.instanceMethod();

        // Calling static method
        StaticMethodExample6.staticMethod();

        // Accessing instance variable from outside the class
        // This will result in a compilation error
        // System.out.println("Instance Variable: " + instance.instanceVar);
    }
}
