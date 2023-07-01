package class2;

public class ToStringExample7 {
    public static void main(String[] args) {
        // Converting primitives to strings
        int num = 42;
        String strFromInt = Integer.toString(num);
        System.out.println("String from int: " + strFromInt);

        double decimal = 3.14159;
        String strFromDouble = Double.toString(decimal);
        System.out.println("String from double: " + strFromDouble);

        boolean flag = true;
        String strFromBoolean = Boolean.toString(flag);
        System.out.println("String from boolean: " + strFromBoolean);

        char character = 'A';
        String strFromChar = Character.toString(character);
        System.out.println("String from char: " + strFromChar);

        // Converting objects to strings
        Integer integerObj = Integer.valueOf(num);
        String strFromIntegerObj = integerObj.toString();
        System.out.println("String from Integer object: " + strFromIntegerObj);

        Double doubleObj = Double.valueOf(decimal);
        String strFromDoubleObj = doubleObj.toString();
        System.out.println("String from Double object: " + strFromDoubleObj);

        Boolean booleanObj = Boolean.valueOf(flag);
        String strFromBooleanObj = booleanObj.toString();
        System.out.println("String from Boolean object: " + strFromBooleanObj);

        Character charObj = Character.valueOf(character);
        String strFromCharObj = charObj.toString();
        System.out.println("String from Character object: " + strFromCharObj);
    }
}
