package class13;

public class StringFormatter5 {
    // Static method to convert a name to uppercase
    public static String convertToUpperCase(String name) {
        return name.toUpperCase();
    }

    // Static method to format a phone number
    public static String formatPhoneNumber(String phoneNumber) {
        // Assuming the input is a 10-digit number without any formatting
        return phoneNumber.replaceFirst("(\\d{3})(\\d{3})(\\d+)", "($1) $2-$3");
    }

    public static void main(String[] args) {
        String name = "John Doe";
        String phoneNumber = "1234567890";

        String uppercaseName = StringFormatter5.convertToUpperCase(name);
        String formattedPhoneNumber = StringFormatter5.formatPhoneNumber(phoneNumber);

        System.out.println("Uppercase Name: " + uppercaseName);
        System.out.println("Formatted Phone Number: " + formattedPhoneNumber);
    }
}
