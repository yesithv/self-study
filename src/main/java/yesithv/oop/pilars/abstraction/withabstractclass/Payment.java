package yesithv.oop.pilars.abstraction.withabstractclass;

public abstract class Payment {

    double service = 1.5;

    // Abstract method: No concrete implementation
    abstract void makePayment(double amount);

    // its allowed methods with body
    void paymentDetails(String method) {
        System.out.println("Payment method = " + method);
    }

}
