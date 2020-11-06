package b3_array_method.exercise;

import java.util.Scanner;

public class ValueMinInArray {
    public static void minValue(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min: " + min);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sizeArr;
        int[] arrNumber;

        System.out.print("Enter size in array: ");
        sizeArr = input.nextInt();

        arrNumber = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.print((i + 1) + ": ");
            arrNumber[i] = input.nextInt();
        }

        minValue(arrNumber);
    }
}
