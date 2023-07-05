package class2;

public class DataTypeOverflowExample2 {
    public static void main(String[] args) {
        int maxValue = 2147483647;
        System.out.println("Max value of int: " + maxValue);

        int overflow = maxValue + 10;
        //2147483657
        System.out.println("Overflow value: " + overflow);
    }
}
