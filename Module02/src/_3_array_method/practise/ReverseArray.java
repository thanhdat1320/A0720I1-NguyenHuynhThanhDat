package _3_array_method.practise;

import java.util.Scanner;

public class ReverseArray {

    public static void reverseArr(int[] arr) {
        int sizeArr = arr.length;
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[sizeArr - 1 - i];
            arr[sizeArr - 1 - i] = temp;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t" );
        }
    }

    public static void main(String[] args) {
        int sizeArr;
        int[] arrNumber;

        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter size of array: ");
            sizeArr = input.nextInt();
            if (sizeArr > 20) {
                System.out.println("Size error!");
            }
        } while (sizeArr > 20);

        arrNumber = new int[sizeArr];
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.print("Enter a number " + (i + 1) + ": ");
            arrNumber[i] = input.nextInt();
        }

        reverseArr(arrNumber);
    }
}
