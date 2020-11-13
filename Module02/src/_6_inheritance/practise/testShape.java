package _6_inheritance.practise;

public class testShape {
    public static void main(String[] args) {
        Circle circle_1 = new Circle();
        System.out.println(circle_1);
        Circle circle_2 = new Circle(5);
        System.out.println(circle_2);
        Circle circle_3 = new Circle("red", false, 20);
        System.out.println(circle_3);
        Circle circle_4 = new Circle();
        circle_4.setFilled(true);
        circle_4.getArea();
        circle_4.setRadius(10);
        circle_4.getArea();
        circle_4.getPerimeter();
        System.out.println(circle_4);


        Rectangle rectangle_1 = new Rectangle();
        System.out.println(rectangle_1);

        Square square_1 = new Square();
        System.out.println(square_1);
    }
}
