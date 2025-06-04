package yesithv.solid.singleresponsibility;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Book {
    private String ssn;
    private String name;
    private String text;

    public void replaceWordInText(String word, String replacementWord) {
        // Which are more concerned with text processing than with core book functionalities.
        //return getText().replaceAll(word, replacementWord);
        setText(TextProcessor.replaceWordInText(text, word, replacementWord));
    }

    public boolean isWordInText(String word) {
        //return getText().contains(word);
        boolean result = TextProcessor.isWordInText(text, word);
        System.out.println("The word = '" + word + "' is on the text ? " + result);
        return result;
    }

    // Bad practice:
    // A little change in file storage / Send email mechanism would require modifications in Book class
    // public void saveToFile(): Handling file storage within the Book class
    // public void sendToEmail()

}
