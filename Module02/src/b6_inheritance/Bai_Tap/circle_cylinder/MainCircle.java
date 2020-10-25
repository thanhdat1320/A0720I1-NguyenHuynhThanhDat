package b6_inheritance.Bai_Tap.circle_cylinder;

public class MainCircle {
    public static void main(String[] args) {
        Circle circle_1 = new Circle(5, "red");
        System.out.println(circle_1);
        Circle circle_2 = new Circle();
        circle_2.setRadius(20);
        circle_2.setColor("yellow");
        System.out.println(circle_2);
        System.out.printf("Area: %.2f", circle_2.getArea());

        System.out.println( "\n" +"=======");

        Circle cylinder_1 = new Cylinder();
        System.out.println(cylinder_1);
        Cylinder cylinder_2 = new Cylinder(9.9, "black", 50);
        System.out.println(cylinder_2);
        System.out.println("Volume: " + cylinder_2.getVolume());
    }
}
