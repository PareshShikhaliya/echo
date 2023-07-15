package class5;


import java.util.Scanner;


public class While11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        int number;

        System.out.println("Enter numbers to calculate the sum (enter -1 to exit):");
        boolean flag = true;

        while (flag) {
            System.out.print("Number: ");
            number = scanner.nextInt();

            if (number == -10) {
                flag=false;
            }

            total += number;
        }

        System.out.println("Sum of numbers: " + total);
        scanner.close();
    }
}

