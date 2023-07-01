package class2;

public class StringIntegerConcatenationExample6 {
    public static void main(String[] args) {
        String message = "The value of x is: ";
        int x = 10;
        int y =200;
        String result = message + x + y;
        System.out.println(result);
        String result2 = x + y+message;
        System.out.println(result2);

    }
}
