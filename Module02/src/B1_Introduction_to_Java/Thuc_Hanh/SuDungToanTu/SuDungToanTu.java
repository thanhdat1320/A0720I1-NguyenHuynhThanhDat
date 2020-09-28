package B1_Introduction_to_Java.Thuc_Hanh.SuDungToanTu;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float wight;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        wight = scanner.nextFloat();

        System.out.println("Enter height: ");
        height = scanner.nextFloat();

        float area = wight * height;
        System.out.println("Area is: " + area);
    }
}
