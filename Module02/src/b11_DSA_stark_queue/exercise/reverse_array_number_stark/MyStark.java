package b11_DSA_stark_queue.exercise.reverse_array_number_stark;

import java.util.Stack;

public class MyStark {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length ; i++) {
            stack.push(arr[i]);
        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
