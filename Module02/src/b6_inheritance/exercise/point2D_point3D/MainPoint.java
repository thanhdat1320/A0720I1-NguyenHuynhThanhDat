package b6_inheritance.exercise.point2D_point3D;

public class MainPoint {
    public static void main(String[] args) {
        Point2D point2D_1 = new Point2D();
        System.out.println(point2D_1);
        Point2D  point2D_2 = new Point2D(10,20);
        System.out.println(point2D_2);
        Point2D  point2D_3 = new Point2D(10,20);
        point2D_3.setX(5.5f);
        point2D_3.setY(9.9f);
        System.out.println(point2D_3);
        Point2D point2D_4 = new Point2D();
        point2D_4.setXY(55, 6.6f);
        System.out.println(point2D_4);
        System.out.println("========");

        Point3D point3D_1 = new Point3D(2);
        System.out.println(point3D_1);
        Point3D point3D_2 = new Point3D(2, 4,6);
        point3D_2.setXYZ(1,5,6);
        System.out.println(point3D_2);
    }
}
