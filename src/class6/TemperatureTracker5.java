package class6;

public class TemperatureTracker {
    public static void main(String[] args) {
        // Declare and initialize an array to store temperatures for each day of the week
        double[] weeklyTemperatures = new double[7];

        // Assign temperature values to the elements of the array
        weeklyTemperatures[0] = 25.5;
        weeklyTemperatures[1] = 26.8;
        weeklyTemperatures[2] = 24.2;
        weeklyTemperatures[3] = 28.3;
        weeklyTemperatures[4] = 27.1;
        weeklyTemperatures[5] = 26.4;
        weeklyTemperatures[6] = 23.9;

        // Accessing elements of the array
        System.out.println("Temperature on Monday: " + weeklyTemperatures[0] + "°C");
        System.out.println("Temperature on Wednesday: " + weeklyTemperatures[2] + "°C");
        System.out.println("Temperature on Friday: " + weeklyTemperatures[4] + "°C");

        // Calculating average temperature
        double totalTemperature = 0.0;
        for (int i = 0; i < weeklyTemperatures.length; i++) {
            totalTemperature += weeklyTemperatures[i];
        }
        double averageTemperature = totalTemperature / weeklyTemperatures.length;
        System.out.println("Average temperature for the week: " + averageTemperature + "°C");
    }
}
