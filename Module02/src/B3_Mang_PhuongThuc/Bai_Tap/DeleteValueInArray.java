package B3_Mang_PhuongThuc.Bai_Tap;

import java.util.Scanner;

public class DeleteValueInArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size in array: ");
        int sizeArr = input.nextInt();
        int[] arrNumber = new int[sizeArr];
        for (int i = 0; i < sizeArr; i++) {
            System.out.print((i + 1) + ": ");
            arrNumber[i] = input.nextInt();
        }
        System.out.print("Enter a number you want delete: ");
        int number = input.nextInt();

        deleteValue(arrNumber, number);
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print(arrNumber[i] + "\t");
        }
    }

    public static int[] deleteValue(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                for (int j = i; j < array.length -1; j++) {
                    array[j] = array[j + 1];
                    if (array[array.length - 1] == array[array.length - 2]) {
                        array[array.length - 1] = 0;
                    }
                }
            }
        }
        return array;
    }
}

