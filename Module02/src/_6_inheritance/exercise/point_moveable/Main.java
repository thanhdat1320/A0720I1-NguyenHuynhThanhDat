package _6_inheritance.exercise.point_moveable;

public class Main {
    public static void main(String[] args) {
        Point point_1 = new Point(2, 1.5f);
        System.out.println(point_1);

        System.out.println("============");

        MoveablePoint moveablePoint_1 = new MoveablePoint(5, 10, 2.2f,9.9f);
        System.out.println(moveablePoint_1);
    }
}
