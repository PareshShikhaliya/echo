package class5;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Temperature Converter");
        System.out.println("Please choose an option:");
        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.println("Enter your choice (1 or 2):");
        byte input = sc.nextByte();
        if(input == 1)
        {
            System.out.println("Enter the temperature in Celsius");
        } else if (input == 2)
        {
            System.out.println("Enter the temperature in Fahrenheit:");
        }else
        {
            System.out.println("Error Not a valid Type!!!");
        }
        double temp = sc.nextDouble();
        if (input == 1)
        {
            double tempInF = celciusToFahrenheit(temp);
            System.out.println("The temperature in Fahrenheit is: "+tempInF+"\'F");
        } else if (input == 2)
        {
            double tempInC = fahrenheightToCelcius(temp);
            System.out.println("The temperature in Celsius is:"+tempInC+"\'C");
        }


    }

    private static double fahrenheightToCelcius(double temp) {
        double tempInC = (5.0/9.0)*(temp - 32);
        return tempInC;
    }

    private static double celciusToFahrenheit(double temp) {
        double tempInF = ((temp*9/5.0)+32);
        return tempInF;
    }
}
