package _11_DSA_stark_queue.exercise.count_word_use_map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> myMap = new TreeMap<>();

        System.out.print("Enter string: ");
        String string = input.nextLine();
        String[] arrString = string.split("\\s+");

        for (String word : arrString) {
            word = word.toLowerCase();
            if (myMap.containsKey(word)) {
                myMap.put(word, myMap.get(word) + 1);
            } else {
                myMap.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
