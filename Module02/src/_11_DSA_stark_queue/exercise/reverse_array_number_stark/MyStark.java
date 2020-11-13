package _11_DSA_stark_queue.exercise.reverse_array_number_stark;

import java.util.Scanner;
import java.util.Stack;

public class MyStark {

    public static void starkNumber() {
        Stack stack = new Stack();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input amount of array: ");
        int count = scanner.nextInt();
        int arr[] = new int[count];

        for (int i = 0; i < count; i++) {
            System.out.print("Input number: ");
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void starkWords() {
        Scanner scanner = new Scanner(System.in);
        Stack stack = new Stack();
        System.out.print("Write something: ");
        String string = scanner.nextLine();

        String[] words = string.split("\\s");
        for (int i = 0; i < words.length; i++) {
            stack.push(words[i]);
        }

        while (!stack.isEmpty()) {
            starkCharacters((String) stack.pop());
            System.out.print(" ");
        }
    }

    public static void starkCharacters(String character) {
        Stack<Character> stack = new Stack();

        for (int i = 0; i < character.length() ; i++) {
            stack.push(character.charAt(i));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("1. Reverse number.");
        System.out.println("2. Reverse string.");
        System.out.println("3. Reverse characters.");
        System.out.print("Your choose: ");
        int choose = input.nextInt();
        switch (choose) {
            case 1: {
                starkNumber();
            }
            break;
            case 2: {
                starkWords();
            }
            break;
            case 3: {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Write something: ");
                String character = scanner.next();
                starkCharacters(character);
            }
        }
    }
}
