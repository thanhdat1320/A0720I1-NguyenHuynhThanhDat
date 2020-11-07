package b13_search_algorithm.exercise.find_string_ascending;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = input.nextLine();

        List<Character> maxList = new LinkedList<>();

        for (int i = 0; i < myString.length() ; i++) {
            LinkedList<Character> tempList = new LinkedList<>();
            tempList.add(myString.charAt(i));
            for (int j = i + 1; j < myString.length() ; j++) {
                if (myString.charAt(j) > tempList.getLast()) {
                    tempList.add(myString.charAt(j));
                }
            }
            if (tempList.size() > maxList.size()) {
                maxList.clear();
                maxList.addAll(tempList);
            }
        }

        for (Character ch : maxList) {
            System.out.print(ch);
        }
    }
}
