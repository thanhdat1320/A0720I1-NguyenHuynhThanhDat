package _13_search_algorithm.practise.BinarySearch;

import java.util.Scanner;

public class BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};

    static int binarySearch(int[] array, int value) {
        int head = 0;
        int mid;
        int tail = array.length - 1;

        while (head <= tail) {
             mid = (head + tail) / 2;
            if (value == array[mid]) {
                return mid;
            } else if (value < array[mid]) {
                tail = mid - 1;
            } else {
                head = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to search: ");
        int value = input.nextInt();
        System.out.println(binarySearch(list, value));
    }
}
