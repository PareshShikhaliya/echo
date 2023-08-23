package class17;

import java.util.HashMap;
import java.util.Map;

public class PhoneBookExample2 {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Alice", "123-456-7890");
        phoneBook.put("Bob", "987-654-3210");
        phoneBook.put("Charlie", "555-555-5555");

        String aliceNumber = phoneBook.get("Alice");
        System.out.println("Alice's phone number: " + aliceNumber);

        System.out.println("Printing all entries in the phone book:");
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
        }
    }
}
