package class2;

public class StringExample4 {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        // String concatenation using the '+' operator
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // Length of the string
        int length = fullName.length();
        System.out.println("Length of the string: " + length);

        // Accessing characters in a string
        char firstChar = fullName.charAt(0);
        System.out.println("First character: " + firstChar);

        // Substring
        String lastNameSubstring = fullName.substring(5);
        System.out.println("Last Name Substring: " + lastNameSubstring);

        // String to lowercase
        String lowercaseName = fullName.toLowerCase();
        System.out.println("Lowercase Name: " + lowercaseName);

        // String to uppercase
        String uppercaseName = fullName.toUpperCase();
        System.out.println("Uppercase Name: " + uppercaseName);

        // Check if a string contains a specific substring
        boolean containsSubstring = fullName.contains("Doe");
        System.out.println("Contains 'Doe'? " + containsSubstring);

        // Replace characters in a string
        String replacedString = fullName.replace("John", "Jane");
        System.out.println("Replaced String: " + replacedString);
    }
}
