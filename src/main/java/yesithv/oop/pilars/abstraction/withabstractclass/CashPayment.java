package yesithv.oop.pilars.abstraction.withabstractclass;

// The Sub class CashPayment extends Payment {
public class CashPayment extends Payment {

    @Override
    void makePayment(double amount) {
        System.out.println("Amount = " + (amount + this.service) + " payed with CASH");
    }

}
