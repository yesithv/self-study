package yesithv.utils;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Given a simple String AABBCCD112233. All you need is to return a new String that will not contain any duplicates.
 * The code should be clean, readable and optimized; also we expect to see test coverage with different test cases.
 * Plase publish you code on GitHub and send us a link
 *
 * @author Yesith Valencia
 * @email yesithvalencia@gmail.com
 * @cellphone: +57 3183973083
 */
public class StringUtils {

    public static void main(String[] args) {
        String word = "AABBCCD112233";
        if (isInvalidWord(word)) {
            System.out.println("'" + word + "'" + " Is not a valid String ... Please try again");
            return;
        }

        String wordWithoutDuplicates = removeDuplicates(word);
        printInformation(word, wordWithoutDuplicates);
    }

    /**
     * Checks if the given word is invalid
     *
     * @param wordToValidate word to validate
     * @return {@code true} if is invalid word
     * {@code false} otherwise
     */
    public static boolean isInvalidWord(String wordToValidate) {
        // Add more validation here, if it's necessary:
        return (wordToValidate == null || wordToValidate.isBlank());
    }

    /**
     * In charge to remove duplicates in a word
     *
     * @param wordToRemove word to process
     * @return word without duplicate
     */
    public static String removeDuplicates(String wordToRemove) {
        // LinkedHashSet to maintain the order on the Set, if order doesn't matter use HashSet
        Set<String> withoutDuplicates = new LinkedHashSet<>();
        for (char c : wordToRemove.toCharArray()) {
            withoutDuplicates.add(String.valueOf(c));
        }
        return withoutDuplicates
                .stream()
                .collect(Collectors.joining());
    }

    public static void printInformation(String word, String wordWithoutDuplicates) {
        System.out.println("Original word = " + word);
        System.out.println("Word without duplicates = " + wordWithoutDuplicates);
        int numDuplicates = word.length() - wordWithoutDuplicates.length();
        System.out.println("The algorithm removed " + numDuplicates + " duplicates");
    }
}