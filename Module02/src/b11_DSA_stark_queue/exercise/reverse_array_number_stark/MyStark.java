package b11_DSA_stark_queue.exercise.reverse_array_number_stark;

import java.util.Scanner;
import java.util.Stack;

public class MyStark {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        Stack<Integer> stack = new Stack<>();
//
//        for (int i = 0; i < arr.length ; i++) {
//            stack.push(arr[i]);
//        }
//
//        while (!stack.isEmpty()) {
//            System.out.println(stack.pop());
//        }
        Stack<String> stackWords = new Stack<>();

        Scanner input = new Scanner(System.in);
        System.out.print("Write something: ");
        String string = input.nextLine();
        String[] words = string.split("\\s");
        for(int i = 0; i < words.length; i++){
            stackWords.push(words[i]);
        }

        while (!stackWords.isEmpty()) {
            System.out.println(stackWords.pop());
        }
    }
}
