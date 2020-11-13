package _3_array_method.practise;

import java.util.Scanner;

public class ValueMaxInArray {

    public static void maxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Max: " + max);
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

        maxValue(arrNumber);
    }
}
