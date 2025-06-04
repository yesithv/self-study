package yesithv.solid.singleresponsibility;

import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void saveToFile(Book book) {
        try (FileWriter fileWriter = new FileWriter(book.getSsn() + ".txt")) {
            fileWriter.write("SSN: " + book.getSsn() + "\n");
            fileWriter.write("Name: " + book.getName() + "\n");
            fileWriter.write("Text: " + book.getText() + "\n");
            System.out.println("Book data saved to file successfully, data: " + book);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
