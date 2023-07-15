package class6;

public class ArrayExample4 {
    public static void main(String[] args) {
        // Declare the array first
        String[] colors;

        // Initialize the array with specific values
        colors = new String[]{"Red", "Green", "Blue"};

        // Accessing elements of the array
        System.out.println("First color: " + colors[0]);
        System.out.println("Second color: " + colors[1]);
        System.out.println("Third color: " + colors[2]);

        // Looping through the array
        System.out.println("All colors:");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }
}
