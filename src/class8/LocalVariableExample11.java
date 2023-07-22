package class8;


public class LocalVariableExample11 {

    public void methodOne() {
        int number = 10; // Local variable in methodOne

        System.out.println("Local variable in methodOne: " + number);
    }

    public void methodTwo() {
        int number = 20; // Local variable in methodTwo (with the same name)

        System.out.println("Local variable in methodTwo: " + number);
    }

    public static void main(String[] args) {
        LocalVariableExample11 example = new LocalVariableExample11();
        example.methodOne(); // Call methodOne
        example.methodTwo(); // Call methodTwo
    }
}
