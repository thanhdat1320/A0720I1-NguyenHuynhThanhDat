package b3_array_method.Thuc_Hanh;

import java.util.Scanner;

public class FindValueInArray {

    public static void findInArray(String[] array) {
        boolean checkName = false;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter name in array: ");
        String name = input.nextLine();
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                System.out.print("In: " + i );
                checkName = true;
                break;
            }
        }
        if (!checkName) {
            System.out.print("Not found in array!");
        }
    }

    public static void main(String[] args) {
        int sizeArr;
        String[] arrName;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Enter size in array: ");
             sizeArr = input.nextInt();
             if (sizeArr > 100) {
                 System.out.println("Size error!");
             }
        } while (sizeArr > 100);

        arrName = new String[sizeArr];
        for (int i = 0; i < arrName.length; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            arrName[i] = input.next();
        }

        findInArray(arrName);
    }
}
