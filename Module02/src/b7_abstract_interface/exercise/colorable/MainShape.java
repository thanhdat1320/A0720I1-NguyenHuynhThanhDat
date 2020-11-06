package b7_abstract_interface.exercise.colorable;

public class MainShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[10];
        shapes[0] = new Circle(5);
        shapes[1] = new Circle(2);
        shapes[2] = new Rectangle(5, 10);
        shapes[3] = new Rectangle(9, 11);
        shapes[4] = new Square(6);
        shapes[5] = new Square(7);

        for (Shape shape : shapes) {
            if (shape instanceof Square) {
                System.out.println("Area of square: " + ((Square) shape).getArea());
                Colorable colorable = (Square) shape;
                colorable.howToColor();
                System.out.println();
            }
            System.out.println();
        }
    }
}
