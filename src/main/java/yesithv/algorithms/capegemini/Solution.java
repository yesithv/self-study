package yesithv.algorithms.capegemini;

import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String word = "swiss";
        System.out.println("Non repeated = " + getCharacterNonRepeated(word));
    }

    private static Character getCharacterNonRepeated(String word) {
        Map<Character, Integer> allWord = new LinkedHashMap<>();
        for (char c : word.toCharArray()) {
            allWord.put(c, allWord.getOrDefault(c, 0) + 1);
        }
        System.out.println("allWord = " + allWord);
        int count = 0;
        for (Map.Entry<Character, Integer> entry : allWord.entrySet()) {
            if (entry.getValue() == 1) {
                count++;
                if (count == 2) {
                    return entry.getKey();
                }
            }
        }
        return null;
    }
}
