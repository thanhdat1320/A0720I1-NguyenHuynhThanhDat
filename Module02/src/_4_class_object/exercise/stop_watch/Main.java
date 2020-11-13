package _4_class_object.exercise.stop_watch;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[1000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10000) + 1;
        }

        StopWatch stopWatch_1 = new StopWatch();
        stopWatch_1.start();
        Arrays.sort(arr);
        stopWatch_1.end();
        System.out.println("Time sort: " + stopWatch_1.getElapsedTime());
    }
}
