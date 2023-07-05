package class3;

public class StringComparisonExample18 {
    public static void main(String[] args) {
        String string1 = "Hello";
        String string2 = "Hello";
        String string3 = new String("Hello");
        String string4 = new String("Hello");

        System.out.println("Using '==':");
        System.out.println(string1 == string2); // true
        System.out.println(string1 == string3); // false
        System.out.println(string3 == string4); // false

        System.out.println("\nUsing 'equals()':");
        System.out.println(string1.equals(string2)); // true
        System.out.println(string1.equals(string3)); // true
        System.out.println(string3.equals(string4)); // true
    }
}
