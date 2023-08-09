package class13;

public class ExecutionOrderExample10 {
    static {
        System.out.println("Static Block 1");
    }

    public ExecutionOrderExample10() {
        System.out.println("Constructor");
    }

    public void instanceMethod() {
        System.out.println("Instance Method");
    }

    static {
        System.out.println("Static Block 2");
    }

    public static void staticMethod() {
        System.out.println("Static Method");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");

        ExecutionOrderExample10 instance = new ExecutionOrderExample10();
        instance.instanceMethod();
        staticMethod();
    }

    static {
        System.out.println("Static Block 3");
    }
}

