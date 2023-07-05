package class3;

import java.util.Scanner;

public class MealRecommendationExample9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the time of day (morning, afternoon, evening): ");
        String timeOfDay = scanner.nextLine();

        if (timeOfDay.equalsIgnoreCase("morning")) {
            System.out.print("Are you in the mood for breakfast? (yes/no): ");
            String moodForBreakfast = scanner.next();

            if (moodForBreakfast.equalsIgnoreCase("yes")) {
                System.out.println("Enjoy your pancakes and bacon!");
            } else {
                System.out.println("How about a light snack?");
            }
        } else if (timeOfDay.equalsIgnoreCase("afternoon")) {
            System.out.print("Are you in the mood for lunch? (yes/no): ");
            String moodForLunch = scanner.next();

            if (moodForLunch.equalsIgnoreCase("yes")) {
                System.out.println("Savor your delicious sandwich and salad!");
            } else {
                System.out.println("How about some afternoon tea?");
            }
        } else if (timeOfDay.equalsIgnoreCase("evening")) {
            System.out.print("Are you in the mood for dinner? (yes/no): ");
            String moodForDinner = scanner.next();

            if (moodForDinner.equalsIgnoreCase("yes")) {
                System.out.println("Delight in a hearty steak and roasted vegetables!");
            } else {
                System.out.println("How about a light supper?");
            }
        } else {
            System.out.println("Invalid time of day entered.");
        }

        scanner.close();
    }
}
