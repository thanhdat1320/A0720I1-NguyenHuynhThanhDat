package _3_array_method.exercise;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter inputString: ");
            String inputString = input.nextLine();

            System.out.print("Enter a character to check: ");
            char inputChar = input.next().charAt(0);
        System.out.println(countChar(inputString, inputChar));

    }

    public static int countChar(String string, char chr) {
        int count = 0;
        for (int i = 0; i < string.length() ; i++) {
            if (string.charAt(i) == chr) {
                count++;
            }
        }
        return count;
    }
}
