package _3_array_method.practise;

import java.util.Scanner;

public class CountStudent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size in array: ");
        int sizeArr = input.nextInt();

        int[] arrStudent  = new int[sizeArr];
        do {
            for (int i = 0; i < arrStudent.length; i++) {
                boolean check = false;
                do {
                    System.out.print("Mark of student: " + (i + 1) + ": ");
                    arrStudent[i] = input.nextInt();
                    if (arrStudent[i] > 10 || arrStudent[i] < 0) {
                        check = true;
                    } else {
                       break;
                    }
                } while (check);
            }
        } while (sizeArr > 20);

        System.out.println(countStudent(arrStudent));
    }

    public static int countStudent(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 5 && array[i] <= 10) {
                count++;
            }
        }
        return count;
    }
}
