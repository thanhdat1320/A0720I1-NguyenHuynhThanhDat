package B1_Introduction_to_Java.Bai_Tap.HienThiLoiChao;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap: ");
        String name = scanner.nextLine();
        System.out.println("hello " + name);
    }

}
