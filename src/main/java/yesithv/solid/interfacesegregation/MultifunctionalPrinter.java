package yesithv.solid.interfacesegregation;

public class MultifunctionalPrinter implements Printer, Fax, Scanner {

    @Override
    public void faxDocument() {
        System.out.println("faxing document ....");
    }

    @Override
    public void printDocument() {
        System.out.println("Printing document ....");
    }

    @Override
    public void scannerDocument() {
        System.out.println("scanning document ....");
    }
}
