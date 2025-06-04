package yesithv.solid.interfacesegregation;

/**
 * INTERFACE SEGREGATION:
 * Larger interfaces should be split into smaller ones, so we ensure that implementing
 * class only need to be concerned about the methods that are of interest to them
 */
public class Main {
    public static void main(String[] args) {

        // Implement only the methods that matter to a simple printer: print
        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.printDocument();

        // Otherwise multifunctional implements: print, scanner and fax
        MultifunctionalPrinter multifunctionalPrinter = new MultifunctionalPrinter();
        multifunctionalPrinter.printDocument();
        multifunctionalPrinter.scannerDocument();
        multifunctionalPrinter.faxDocument();
    }
}
