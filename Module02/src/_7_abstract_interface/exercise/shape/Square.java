package _7_abstract_interface.exercise.shape;

public class Square extends Rectangle implements Resizeable{
    public  Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public String toString() {
        return " A Square with side = " + getSide() + " which is a subclass of " + super.toString();
    }
}
