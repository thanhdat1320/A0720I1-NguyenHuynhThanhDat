package b11_DSA_stark_queue.optional.change_number;

import java.util.Scanner;

public class Main {

    public static int decToBin(int decNumber) {
        int binNumber = 0;
        int count = 0;
        while (decNumber > 0) {
            binNumber += (decNumber % 2) * Math.pow(10, count);
            ++count;
            decNumber /= 2;
        }
        return binNumber;
    }

    public static int binToDec(int binNumber) {
        int decNumber = 0;
        int count = 0;
        while (binNumber > 0) {
            decNumber += (binNumber % 2) * Math.pow(2, count);
            ++count;
            binNumber /= 10;
        }
        return decNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Your choose: ");
        int choose = input.nextInt();

        switch (choose) {
            case 1: {
                System.out.print("Input decimal number: ");
                int num = input.nextInt();
                System.out.println("Decimal => Binary: " + decToBin(num));
                break;
            }
            case 2: {
                System.out.print("Input binary number: ");
                int num = input.nextInt();
                System.out.println("Binary => Decimal: " + binToDec(num));
            }
        }
    }
}
