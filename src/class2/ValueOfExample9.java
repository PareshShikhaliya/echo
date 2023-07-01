package class2;

public class ValueOfExample9 {
    public static void main(String[] args) {
        // Converting int to string using valueOf()
        int intValue = 42;
        String strFromInt = String.valueOf(intValue);
        System.out.println("String from int: " + strFromInt);

        // Converting double to string using valueOf()
        double doubleValue = 3.14159;
        String strFromDouble = String.valueOf(doubleValue);
        System.out.println("String from double: " + strFromDouble);

        // Converting boolean to string using valueOf()
        boolean booleanValue = true;
        String strFromBoolean = String.valueOf(booleanValue);
        System.out.println("String from boolean: " + strFromBoolean);

        // Converting char to string using valueOf()
        char charValue = 'A';
        String strFromChar = String.valueOf(charValue);
        System.out.println("String from char: " + strFromChar);
    }
}
