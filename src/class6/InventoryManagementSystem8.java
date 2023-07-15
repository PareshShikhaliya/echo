package class6;

import java.util.Scanner;

public class InventoryManagementSystem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Create arrays to store product names and quantities
        String[] productNames = new String[numProducts];
        int[] productQuantities = new int[numProducts];

        // Input product details
        for (int i = 0; i < numProducts; i++) {
            System.out.print("Enter product name: ");
            productNames[i] = scanner.nextLine();

            System.out.print("Enter product quantity: ");
            productQuantities[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
        }

        // Display inventory
        System.out.println("\nCurrent Inventory:");
        for (int i = 0; i < numProducts; i++) {
            System.out.println(productNames[i] + " - " + productQuantities[i]);
        }

        // Check for low stock products
        System.out.println("\nLow Stock Products:");
        for (int i = 0; i < numProducts; i++) {
            if (productQuantities[i] < 5) {
                System.out.println(productNames[i] + " - " + productQuantities[i]);
            }
        }

        // Update product quantity
        System.out.print("\nEnter product name to update quantity: ");
        String productNameToUpdate = scanner.nextLine();

        System.out.print("Enter new quantity: ");
        int newQuantity = scanner.nextInt();

        for (int i = 0; i < numProducts; i++) {
            if (productNames[i].equalsIgnoreCase(productNameToUpdate)) {
                productQuantities[i] = newQuantity;
                break;
            }
        }

        // Display updated inventory
        System.out.println("\nUpdated Inventory:");
        for (int i = 0; i < numProducts; i++) {
            System.out.println(productNames[i] + " - " + productQuantities[i]);
        }
    }
}
