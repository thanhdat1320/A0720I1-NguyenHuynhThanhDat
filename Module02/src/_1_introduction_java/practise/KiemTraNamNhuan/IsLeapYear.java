package _1_introduction_java.practise.KiemTraNamNhuan;

import java.util.Scanner;

public class IsLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("input year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.print( year + " is a leap year");
        } else {
            System.out.print(year + " is not a leap year");
        }
    }
}
