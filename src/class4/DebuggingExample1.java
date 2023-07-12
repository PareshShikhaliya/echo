package class4;

public class DebuggingExample1 {
    public static void main(String[] args)
    {
        int num1 = 5;
        int num2 = 10;

        // This division will cause an ArithmeticException
        int result = num1 / num2;

        System.out.println("The result is: " + result);
    }
}
