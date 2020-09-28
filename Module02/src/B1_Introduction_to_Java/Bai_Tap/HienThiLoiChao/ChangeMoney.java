package B1_Introduction_to_Java.Bai_Tap.HienThiLoiChao;

import java.util.Scanner;

public class ChangeMoney {

    public static void changMoney(int money) {
        System.out.print("VND: " + money * 23000);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USD: ");
        int moneyUSD = input.nextInt();
        changMoney(moneyUSD);
    }

}
