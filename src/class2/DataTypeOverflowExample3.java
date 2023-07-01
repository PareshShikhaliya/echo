package class2;

public class DataTypeOverflowExample3 {
    public static void main(String[] args) {
        boolean flag = true;
        byte smallByte = 127;
        short smallShort = 32767;
        int largeInt = 2147483647;
        long largeLong = 9223372036854775807L;
        char character = 'A';
        float largeFloat = 3.4E+38f;
        double largeDouble = 1.7E+308;

        System.out.println("Flag: " + flag);
        System.out.println("Small byte: " + smallByte);
        System.out.println("Small short: " + smallShort);
        System.out.println("Large int: " + largeInt);
        System.out.println("Large long: " + largeLong);
        System.out.println("Character: " + character);
        System.out.println("Large float: " + largeFloat);
        System.out.println("Large double: " + largeDouble);

        // Overflow examples
        byte overflowByte = (byte) (smallByte + 1);
        short overflowShort = (short) (smallShort + 1);
        int overflowInt = largeInt + 1;
        long overflowLong = largeLong + 1L;
        float overflowFloat = largeFloat * 2.0f;
        double overflowDouble = largeDouble * 2.0;

        System.out.println("Overflow byte: " + overflowByte);
        System.out.println("Overflow short: " + overflowShort);
        System.out.println("Overflow int: " + overflowInt);
        System.out.println("Overflow long: " + overflowLong);
        System.out.println("Overflow float: " + overflowFloat);
        System.out.println("Overflow double: " + overflowDouble);
    }
}
