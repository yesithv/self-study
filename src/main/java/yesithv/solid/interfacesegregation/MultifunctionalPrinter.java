package yesithv.solid.interfacesegregation;

import yesithv.solid.interfacesegregation.interfaces.Fax;
import yesithv.solid.interfacesegregation.interfaces.Printer;
import yesithv.solid.interfacesegregation.interfaces.Scanner;

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
