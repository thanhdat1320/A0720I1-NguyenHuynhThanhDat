package b1_introduction_java.exercise.say_hello;

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
