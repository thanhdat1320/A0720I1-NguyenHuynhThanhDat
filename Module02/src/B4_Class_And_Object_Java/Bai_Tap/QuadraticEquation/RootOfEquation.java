package B4_Class_And_Object_Java.Bai_Tap.QuadraticEquation;

import java.util.Scanner;

public class RootOfEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number a: ");
        double a = input.nextDouble();
        System.out.print("Enter number b: ");
        double b = input.nextDouble();
        System.out.print("Enter number c: ");
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        if (equation.getDiscriminant() > 0) {
            System.out.println("Root1: " + equation.getRoot1());
            System.out.print("Root2: " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.print("Root1 = Root2: " + equation.getRoot1());
        } else {
            System.out.print("Equation has no root.");
        }
    }
}
