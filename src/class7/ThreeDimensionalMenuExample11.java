package class7;

import javax.swing.*;
import java.awt.*;

public class ThreeDimensionalMenuExample11 {
    public static void main(String[] args) {
        // Define the menu items
        String[][][] menuItems = {
                {
                        {"Appetizers", "Soup & Salad"},
                        {"Steak", "Chicken", "Fish"},
                        {"Desserts"}
                },
                {
                        {"Italian Cuisine", "Pasta"},
                        {"Burgers", "Sandwiches", "Wraps"},
                        {"Beverages", "Desserts"}
                }
        };

        // Create the main frame
        JFrame frame = new JFrame("Restaurant Menu");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create the menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create the main menu
        JMenu mainMenu = new JMenu("Menu");

        // Create the submenus and menu items
        for (int x = 0; x < menuItems.length; x++) {
            JMenu categoryMenu = new JMenu(getCategoryName(x));
            for (int y = 0; y < menuItems[x].length; y++) {
                JMenu subcategoryMenu = new JMenu(getSubcategoryName(x, y));
                for (int z = 0; z < menuItems[x][y].length; z++) {
                    JMenuItem menuItem = new JMenuItem(menuItems[x][y][z]);
                    subcategoryMenu.add(menuItem);
                }
                categoryMenu.add(subcategoryMenu);
            }
            mainMenu.add(categoryMenu);
        }

        // Add the main menu to the menu bar
        menuBar.add(mainMenu);

        // Set the menu bar on the frame
        frame.setJMenuBar(menuBar);

        // Display the frame
        frame.setVisible(true);
    }

    // Helper method to get category name based on index
    private static String getCategoryName(int index) {
        switch (index) {
            case 0:
                return "Appetizers & Soups";
            case 1:
                return "Main Course";
            default:
                return "Category " + (index + 1);
        }
    }

    // Helper method to get subcategory name based on index
    private static String getSubcategoryName(int categoryIndex, int subcategoryIndex) {
        switch (categoryIndex) {
            case 0:
                switch (subcategoryIndex) {
                    case 0:
                        return "Appetizers";
                    case 1:
                        return "Soups & Salads";
                    default:
                        return "Subcategory " + (subcategoryIndex + 1);
                }
            case 1:
                switch (subcategoryIndex) {
                    case 0:
                        return "Italian Cuisine";
                    case 1:
                        return "Pasta";
                    default:
                        return "Subcategory " + (subcategoryIndex + 1);
                }
            default:
                return "Subcategory " + (subcategoryIndex + 1);
        }
    }
}
