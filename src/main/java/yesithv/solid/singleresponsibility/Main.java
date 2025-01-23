package yesithv.solid.singleresponsibility;

/**
 * SINGLE RESPONSIBILITY:
 * A class or microservice should only have one responsibility, furthermore, it should have one reason to change
 */
public class Main {
    public static void main(String[] args) {
        Book book = new Book("ABC123", "The book of life", "Lorem ipsun text alfe iro inwsqo");
        FileManager fileManager = new FileManager();
        fileManager.saveToFile(book);
    }
}
