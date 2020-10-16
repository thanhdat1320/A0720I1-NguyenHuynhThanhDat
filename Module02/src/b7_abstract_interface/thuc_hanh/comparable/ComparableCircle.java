package b7_abstract_interface.thuc_hanh.comparable;

import B6__KeThua.Thuc_Hanh.Circle;

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
