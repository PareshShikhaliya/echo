package class3;

public class ComparisonOperatorExample3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int max = 15;
        int age = 18;
        String time = "morning";

        boolean lessThan = (a < 10); // Checks if 'a' is less than 10
        boolean greaterThan = (b > a); // Checks if 'b' is greater than 'a'
        boolean lessThanOrEqual = (a <= 10); // Checks if 'a' is less than or equal to 10
        boolean greaterThanOrEqual = (max >= a); // Checks if 'max' is greater than or equal to 'a'
        boolean equalTo = (age == 18); // Checks if 'age' is equal to 18
        boolean notEqualTo = (time != "evening"); // Checks if 'time' is not equal to "evening"

        System.out.println("lessThan: " + lessThan);
        System.out.println("greaterThan: " + greaterThan);
        System.out.println("lessThanOrEqual: " + lessThanOrEqual);
        System.out.println("greaterThanOrEqual: " + greaterThanOrEqual);
        System.out.println("equalTo: " + equalTo);
        System.out.println("notEqualTo: " + notEqualTo);
    }
}
