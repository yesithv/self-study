package yesithv.algorithms.capegemini;

import java.util.LinkedHashMap;
import java.util.Map;

public class Capegimini {
    public static void main(String[] args) {
        String output;

        Map<String, Integer> nonRepeated = new LinkedHashMap<>();
        String word = "swiss";  // Output: i

        int letterNonRepeated = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            int counter = 0;

            if (nonRepeated.containsKey(String.valueOf(c))) {
                var repetition = nonRepeated.get(String.valueOf(c));
                nonRepeated.remove(String.valueOf(c));
                repetition++;
                nonRepeated.put(String.valueOf(c), repetition);
                if (repetition == 2) {
                    System.out.println("output = " + c);
                }
            } else {
                counter++;
                nonRepeated.put(String.valueOf(c), counter);
                System.out.println("Add new element = " + c + " with counter: " + counter);
            }
        }
        System.out.println("map: " + nonRepeated);
    }
}
