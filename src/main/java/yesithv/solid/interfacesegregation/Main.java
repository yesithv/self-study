package yesithv.solid.interfacesegregation;

/**
 * INTERFACE SEGREGATION:
 * Larger interfaces should be split into smaller ones, so we ensure that implementing
 * class only need to be concerned about the methods that are of interest to them
 */
public class Main {
    public static void main(String[] args) {

        // Implement only the methods that matter to us
        SimplePrinter sp1 = new SimplePrinter();
        sp1.printDocument();

        // Classes only implement interfaces they use
        MultifunctionalPrinter mp2 = new MultifunctionalPrinter();
        mp2.printDocument();
        mp2.scannerDocument();
        mp2.faxDocument();
    }
}
