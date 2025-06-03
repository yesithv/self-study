package yesithv.oop.abstraction.withinterfaces;

/**
 * INTERFACE:
 * It's a complete abstract class, it's used to group related methods with empty bodies
 */
public class WithInterfaces {

    public static void main(String[] args) {
        // Can't create objects because it's an interface
        // Animal animal1 = new Animal();
        Animal animal1 = new Pig();
        animal1.animalSound();
        animal1.run(20);

        Animal animal2 = new Bird();
        animal2.animalSound();
        animal2.run(35);

        System.out.println("Static and final: " + Animal.maxLivingAge);
    }
}
