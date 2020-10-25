package b6_inheritance.Bai_Tap.circle_cylinder;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        radius = 0;
        color = "not color";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Radius: " + getRadius() + "\n" + "Color: " + getColor() + "\n";
    }
}
