package b3_array_method.Thuc_Hanh;

import java.util.Scanner;

public class ChangeTemperature {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        double fahrenheit, celsius;

        do {
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2.  Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.println("***");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter fahrenheit: ");
                    fahrenheit = input.nextDouble();
                    System.out.println(fahrenheitToCelsius(fahrenheit));
                    break;
                }
                case 2: {
                    System.out.print("Enter celsius: ");
                    celsius = input.nextDouble();
                    System.out.println(celsiusToFahrenheit(celsius));
                    break;
                }
                case 3: {
                    System.exit(0);
                }
            }
        } while (choice != 0);
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
         double celsius = (5.0 / 9) * (fahrenheit - 32);
         return celsius;
    }

    public static double  celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
}
