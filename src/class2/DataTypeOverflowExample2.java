package class2;

public class DataTypeOverflowExample2 {
    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Max value of int: " + maxValue);

        int overflow = maxValue + 10;
        System.out.println("Overflow value: " + overflow);
    }
}
