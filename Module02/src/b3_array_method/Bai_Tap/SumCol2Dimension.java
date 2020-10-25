package b3_array_method.Bai_Tap;

import java.util.Scanner;

public class SumCol2Dimension {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = input.nextInt();
        System.out.print("Enter size element: ");
        int sizeElement = input.nextInt();
        // Enter element in array
        int[][] arr = new int[size][sizeElement];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print("Enter element: " + i + " " + j + ": ");
                arr[i][j] = input.nextInt();
            }
        }
        // Display array
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.print("Enter column: ");
        int choice = input.nextInt();

        System.out.print("Sum: " + sumCol(arr, choice));
    }

    public static int sumCol(int[][] array, int temp) {
        int sumCol = 0;

        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                sumCol += array[i][temp];
                break;
            }
        }
        return sumCol;
    }
}
