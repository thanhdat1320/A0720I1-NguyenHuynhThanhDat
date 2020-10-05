package B5_AccessModifier_StaticMethod_StaticProperty.Bai_Tap.Circle;

import B5_AccessModifier_StaticMethod_StaticProperty.Bai_Tap.Circle.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle_1 = new Circle();
        System.out.println(circle_1.getRadius());
        System.out.println(circle_1.getColor());
        System.out.println(circle_1.getArea());

        System.out.println("============");

        Circle circle_2 = new Circle();
        circle_2.setRadius(10);
        System.out.println(circle_2.getRadius());
        circle_2.setColor("yellow");
        System.out.println(circle_2.getColor());
        System.out.println(circle_2.getArea());
    }
}
