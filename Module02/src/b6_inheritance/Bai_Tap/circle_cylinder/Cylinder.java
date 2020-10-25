package b6_inheritance.Bai_Tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){
        height = 0;
    }
    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Height: " + getHeight() + "\n" + super.toString();
    }
}
