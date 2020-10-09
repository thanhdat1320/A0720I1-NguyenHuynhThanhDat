package B6__KeThua.Bai_Tap.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner input = new Scanner(System.in);
        boolean check = false;
        boolean fill;

        System.out.print("Enter color: ");
        triangle.setColor(input.nextLine());
        System.out.print("Enter fill: ");
        triangle.setFilled(input.nextBoolean());
        System.out.print("Enter side1: ");
        triangle.setSide1(input.nextDouble());
        System.out.print("Enter side2: ");
        triangle.setSide2(input.nextDouble());
        System.out.print("Enter side3: ");
        triangle.setSide3(input.nextDouble());
        System.out.println("Area: " + triangle.getArea());
        System.out.print("Perimeter: " + triangle.getPerimeter());

    }
}
