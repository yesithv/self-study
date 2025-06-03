package yesithv.oop.pilars.abstraction.withabstractclass;

/**
 * ABSTRACTION:
 * It's about hiding the implementation details and showing only the essential features of an object
 */
public class WithAbstractClass {

    public static void main(String[] args) {
        Payment payment1 = new CardPayment();
        // paymentDetails method belongs to Payment abstract class
        payment1.paymentDetails("Credit card");
        // makePayment method is a concrete implementation of CardPayment class
        payment1.makePayment(120);

        Payment payment2 = new CashPayment();
        payment2.paymentDetails("Cash");
        payment2.makePayment(10.5);

        // Can't create Payment objects because it's an abstract class
        // Must be inherited from another class
        // Payment payment3 = new Payment()
    }
}
