package _2_loop.practise.UngDungTinhTienLaiChoVay;

import java.util.Scanner;

public class InterestMoney {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        double money = input.nextDouble();
        double interestRate = input.nextDouble();

        double result = 0;
        for (int i = 0; i < month; i++) {
            result += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total " + result);
    }
}
