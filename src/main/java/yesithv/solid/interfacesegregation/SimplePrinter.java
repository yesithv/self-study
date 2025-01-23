package yesithv.solid.interfacesegregation;

public class SimplePrinter implements Printer{

    @Override
    public void printDocument() {
        System.out.println("Printing document ....");
    }
}
