package _3_array_method.exercise;

import java.util.Scanner;

public class AddValueInArray {
    public static int[] addValue(int[] array, int num, int index) {
        for (int i = index; i < array.length - 1; i++) {
            array[i + 1] = array[i];
            array[index] = num;
            break;
        }
        return array;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size in array: ");
        int sizeArr = input.nextInt();

        int[] arrNumber = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.print((i) + ": ");
            arrNumber[i] = input.nextInt();
        }

        System.out.print("Enter index to add: ");
        int indexArr = input.nextInt();
        System.out.print("Enter a number you want add: ");
        int number = input.nextInt();

        addValue(arrNumber, number, indexArr);
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + "\t");
        }
    }
}
