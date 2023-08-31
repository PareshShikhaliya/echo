package class19;

enum CoffeeSize {
    SMALL("Small", 8),
    MEDIUM("Medium", 12),
    LARGE("Large", 16);

    private final String label;
    private final int ounces;

    CoffeeSize(String label, int ounces) {
        this.label = label;
        this.ounces = ounces;
    }

    public String getLabel() {
        return label;
    }

    public int getOunces() {
        return ounces;
    }

    public static CoffeeSize fromLabel(String label) {
        for (CoffeeSize size : CoffeeSize.values()) {
            if (size.getLabel().equalsIgnoreCase(label)) {
                return size;
            }
        }
        throw new IllegalArgumentException("No such coffee size with label: " + label);
    }
}

public class CoffeeShop7 {
    public static void main(String[] args) {
        // Using values() method to iterate through all enum values
        System.out.println("Available coffee sizes:");
        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size.getLabel() + " - " + size.getOunces() + " ounces");
        }

        // Using valueOf() method to convert a string to an enum
        String sizeLabel = "Medium";
        CoffeeSize size = CoffeeSize.valueOf(sizeLabel.toUpperCase());
        System.out.println("You ordered a " + size.getLabel() + " coffee, which is " + size.getOunces() + " ounces.");

        // Using custom fromLabel() method to convert a string to an enum
        String anotherSizeLabel = "Large";
        CoffeeSize anotherSize = CoffeeSize.fromLabel(anotherSizeLabel);
        System.out.println("You ordered a " + anotherSize.getLabel() + " coffee, which is " + anotherSize.getOunces() + " ounces.");
    }
}
