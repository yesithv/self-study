package yesithv.solid.singleresponsibility;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("ABC123", "The book of life", "Lorem ipsun text alfe iro inwsqo");
        FileManager fileManager = new FileManager();
        fileManager.saveToFile(book);
    }
}
