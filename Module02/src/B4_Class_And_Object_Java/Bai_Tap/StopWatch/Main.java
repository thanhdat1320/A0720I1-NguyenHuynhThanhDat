package B4_Class_And_Object_Java.Bai_Tap.StopWatch;

import java.lang.reflect.Array;
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
