package b7_abstract_interface.exercise.shape;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(1);
        shapes[1] = new Rectangle(5, 10);
        shapes[2] = new Square(5);

        double percent = Math.random() * 100 + 1;
        System.out.println("Percent: " + percent + "\n");

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                System.out.println("Before area circle : " + ((Circle) shape).getArea());
            } else if (shape instanceof Square) {
                System.out.println("Before area square: " + ((Square) shape).getArea());
            } else if (shape instanceof Rectangle) {
                System.out.println("Before area rectangle: " + ((Rectangle) shape).getArea());
            }
        }

        System.out.println("============");

        for (Shape shape : shapes) {
            if (shape instanceof Circle) {
                Resizeable resCircle = (Circle) shape;
                resCircle.resize(percent);
                System.out.println("After area circle: " + ((Circle) shape).getArea());
            } else if (shape instanceof Square) {
                Resizeable resRec = (Square) shape;
                resRec.resize(percent);
                System.out.println("After area square: " + ((Square) shape).getArea());
            } else if (shape instanceof Rectangle) {
                Resizeable resRec = (Rectangle) shape;
                resRec.resize(percent);
                System.out.println("After area rectangle: " + ((Rectangle) shape).getArea());
            }
        }
    }
}
