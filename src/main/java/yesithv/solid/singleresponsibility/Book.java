package yesithv.solid.singleresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * SINGLE RESPONSIBILITY:
 * A class or microservice should only have one responsibility, furthermore, it should have one reason to change
 */
@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String ssn;
    private String name;
    private String text;

    public String replaceWordInText(String word, String replacementWord) {
        // Which are more concerned with text processing than with core book functionalities.
        //return getText().replaceAll(word, replacementWord);
        return TextProcessor.replaceWordInText(text, word, replacementWord);
    }

    public boolean isWordInText(String word) {
        //return getText().contains(word);
        return TextProcessor.isWordInText(text, word);
    }

    // Bad practice:
    // A little change in file storage / Send email mechanism would require modifications in Book class
    // public void saveToFile(): Handling file storage within the Book class
    // public void sendToEmail()

}
