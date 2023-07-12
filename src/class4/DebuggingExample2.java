package class4;

import java.util.ArrayList;
import java.util.List;

public class DebuggingExample2 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 0;

        // This division will cause an ArithmeticException
        int result = divide(num1, num2);

        System.out.println("The result is: " + result);

        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        String firstElement = getElementAtIndex(names, 3);

        System.out.println("The first element is: " + firstElement);
    }

    public static int divide(int num1, int num2) {
        int result;
        try {
            result = num1 / num2;
        } catch (ArithmeticException e) {
            result = -1;
        }
        return result;
    }

    public static String getElementAtIndex(List<String> list, int index) {
        if (index < 0 || index >= list.size()) {
            return null;
        }
        return list.get(index);
    }
}
