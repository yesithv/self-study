package yesithv.exceptions;

import javax.swing.*;

public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            String value = JOptionPane.showInputDialog(null, "Enter a number");
            int m = Integer.parseInt(value);
            Integer division = 10 / m;
            System.out.println("División = " + division);
        } catch (NumberFormatException nfe) {
            System.out.println("nfe = " + nfe);
            main(args);
        } catch (ArithmeticException ae) {
            System.out.println("Capturamos en tiempo de ejecución = " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Optional: Cerrar recursos ");
        }
        System.out.println("El programa continua la ejecución");
    }
}
