package class17;

import java.util.HashMap;
import java.util.Map;

public class InventoryExample3 {
    public static void main(String[] args) {
        Map<String, Integer> inventory = new HashMap<>();

        // Adding items to the inventory
        inventory.put("Apples", 50);
        inventory.put("Bananas", 75);
        inventory.put("Oranges", 30);

        // Updating the quantity of an item
        inventory.put("Apples", 60);

        // Retrieving the quantity of an item
        int bananasQuantity = inventory.get("Bananas");
        System.out.println("Quantity of Bananas: " + bananasQuantity);

        // Removing an item from the inventory
        inventory.remove("Oranges");

        System.out.println("Printing inventory items and quantities:");
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }
    }
}
