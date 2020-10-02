package B4_Class_And_Object_Java.Thuc_Hanh.Rectangle;

import java.util.Scanner;

public class EX14_1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter width: ");
        double width = input.nextDouble();

        System.out.print("Enter height: ");
        double height = input.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.print("Rectangle: " + rectangle.display());
        System.out.print("Perimeter: " + rectangle.getPerimeter());
        System.out.print("Area: " + rectangle.getArea());
    }
}
