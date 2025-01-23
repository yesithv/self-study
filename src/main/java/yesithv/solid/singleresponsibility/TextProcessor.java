package yesithv.solid.singleresponsibility;

public class TextProcessor {

    public static String replaceWordInText(String text, String word, String replacementWord) {
        return text.replaceAll(word, replacementWord);
    }

    public static boolean isWordInText(String text, String word) {
        return text.contains(word);
    }
}
