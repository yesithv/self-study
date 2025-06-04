package yesithv.solid.openextensionclosedmodification;

import yesithv.solid.openextensionclosedmodification.inheritance.Guitar;
import yesithv.solid.openextensionclosedmodification.inheritance.RockGuitar;
import yesithv.solid.openextensionclosedmodification.interfaces.Discount;
import yesithv.solid.openextensionclosedmodification.interfaces.PremiumDiscount;
import yesithv.solid.openextensionclosedmodification.interfaces.RegularDiscount;

/**
 * OPEN FOR EXTENSION CLOSED FOR MODIFICATION:
 * We stop ourselves form modifying existing code and causing potential new bugs
 * One exception: When fixing bugs in existing code
 */
public class Main {

    public static void main(String[] args) {
        // 1. Using inheritance:
        Guitar classic = new Guitar("gc-01", 20);
        // Need to add the color to Guitar Class:
        Guitar rock = new RockGuitar("gr-01", 40, "Red");

        // 2. Using interfaces:
        // Need to customize business process
        Discount regular = new RegularDiscount();
        System.out.println("Regular discount amount = " + regular.calculate(100));
        Discount premium = new PremiumDiscount();
        System.out.println("Premium discount amount = " + premium.calculate(100));
    }

}
