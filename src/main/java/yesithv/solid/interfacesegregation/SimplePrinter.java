package yesithv.solid.interfacesegregation;

import yesithv.solid.interfacesegregation.interfaces.Printer;

public class SimplePrinter implements Printer {

    @Override
    public void printDocument() {
        System.out.println("Printing document ....");
    }
}
