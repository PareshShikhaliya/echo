package class8;

public class MainClass7 {

    public static void main(String[] args) {
        int number = 10;

        System.out.println("Before method call: number = " + number);

        // Call the method passing the primitive variable
        modifyPrimitive(number);

        System.out.println("After method call: number = " + number);
    }

    // Method that attempts to modify the primitive variable
    public static void modifyPrimitive(int number) {
        number = number * 2;
        System.out.println("Inside method: value = " + number);
    }
}
