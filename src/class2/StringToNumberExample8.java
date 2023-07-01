package class2;

public class StringToNumberExample8 {
    public static void main(String[] args) {
        // Converting string to int
        String strInt = "42";
        int intVal = Integer.parseInt(strInt);
        System.out.println("Integer value: " + intVal);

        // Converting string to double
        String strDouble = "3.14159";
        double doubleVal = Double.parseDouble(strDouble);
        System.out.println("Double value: " + doubleVal);

        // Converting string to long
        String strLong = "1234567890";
        long longVal = Long.parseLong(strLong);
        System.out.println("Long value: " + longVal);

        // Converting string to float
        String strFloat = "2.71828";
        float floatVal = Float.parseFloat(strFloat);
        System.out.println("Float value: " + floatVal);
    }
}
