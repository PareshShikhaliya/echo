package class3;

public class ComparisonOperatorExample4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = 15;
        int age = 18;
        String time = "morning";

        if (a < 10) {
            System.out.println("a is less than 10");
        } else {
            System.out.println("a is not less than 10");
        }

        if (b > a) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("b is not greater than a");
        }

        if (a <= 10) {
            System.out.println("a is less than or equal to 10");
        } else {
            System.out.println("a is not less than or equal to 10");
        }

        if (max >= a) {
            System.out.println("max is greater than or equal to a");
        } else {
            System.out.println("max is not greater than or equal to a");
        }

        if (age == 18) {
            System.out.println("age is equal to 18");
        } else {
            System.out.println("age is not equal to 18");
        }

        if (time.equals("evening")) {
            System.out.println("time is equal to evening");
        } else {
            System.out.println("time is not equal to evening");
        }
    }
}
