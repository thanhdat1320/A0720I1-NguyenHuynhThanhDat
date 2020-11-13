package _7_abstract_interface.practise.comparable_shape;

import _6_inheritance.practise.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(int radius) {
        super(radius);
    }

    public ComparableCircle(String color, boolean filled, int radius) {
        super(color, filled, radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        return (int) (this.getRadius() - o.getRadius());
    }
}
