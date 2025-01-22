package yesithv.oop.abstraction.withabstractclass;

public abstract class Payment {

    double service = 1.5;

    // Abstract method: No concrete implementation
    abstract void makePayment(double amount);

    void paymentDetails(String method) {
        System.out.println("Payment method = " + method);
    }

}
