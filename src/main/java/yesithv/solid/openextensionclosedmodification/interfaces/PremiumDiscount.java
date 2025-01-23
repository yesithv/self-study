package yesithv.solid.openextensionclosedmodification.interfaces;

public class PremiumDiscount implements Discount{
    @Override
    public double calculate(double amount) {
        return amount * 0.3;
    }
}
