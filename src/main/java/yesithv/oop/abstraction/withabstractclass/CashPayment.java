package yesithv.oop.abstraction.withabstractclass;

// Subclass2ic class CashPayment extends Payment {
public class CashPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Amount = " + (amount + this.service) + " payed with CASH");
    }

}
