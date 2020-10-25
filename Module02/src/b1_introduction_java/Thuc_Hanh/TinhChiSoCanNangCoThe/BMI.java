package b1_introduction_java.Thuc_Hanh.TinhChiSoCanNangCoThe;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input weight: ");
        double weight = scanner.nextDouble();

        System.out.print("input height: ");
        double height = scanner.nextDouble();

        double bmi = weight / Math.pow(height, 2);

        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-10.3f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}
