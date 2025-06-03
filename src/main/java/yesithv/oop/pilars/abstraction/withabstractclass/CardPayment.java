package yesithv.oop.pilars.abstraction.withabstractclass;

// SubClass1
public class CardPayment extends Payment{

    double service = 5.5;

    @Override
    void makePayment(double amount) {
        System.out.println("Amount = " + (amount + this.service) + " payed with CARD");
    }

}
