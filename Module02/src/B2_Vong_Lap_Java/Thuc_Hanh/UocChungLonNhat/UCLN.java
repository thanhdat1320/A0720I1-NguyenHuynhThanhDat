package B2_Vong_Lap_Java.Thuc_Hanh.UocChungLonNhat;

import java.util.Scanner;

public class UCLN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int numberA = input.nextInt();
        System.out.print("Enter number b: ");
        int numberB = input.nextInt();
        numberA = Math.abs(numberA);
        numberB = Math.abs(numberB);

        if (numberA == 0 || numberB == 0) {
            System.out.println("Khong co UCLL.");
        }

        while (numberA != numberB) {
            if (numberA > numberB) {
                numberA -= numberB;
            } else {
                numberB -= numberA;
            }
        }

        System.out.println("UCLL: " + numberA);
    }
}
