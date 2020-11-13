package _7_abstract_interface.practise.comparable_shape;

import java.util.Arrays;

public class MainComparable {
    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("red", false, 6);

        System.out.println("Pre-sort.");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After-sort");
        for (ComparableCircle circle : circles) {
            System.out.println(circle);
        }
    }


}
