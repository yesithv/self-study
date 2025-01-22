package yesithv.oop.abstraction;

/**
 * INTERFACE:
 * It's a complete abstract class, it's used to group related methods with empty bodies
 */
interface Animal {
    void animalSound();
    void run(double velocity);
}

class Pig implements Animal {

    @Override
    public void animalSound() {
        System.out.println("Pig noise Oig Oig Oig ");
    }

    @Override
    public void run(double velocity) {
        System.out.println("Pig velocity = " + velocity);
    }
}

public class WithInterfaces {

    public static void main(String[] args) {
        // Can't create objects because it's an interface
        // Animal animal1 = new Animal();
        Animal animal1 = new Pig();
        animal1.animalSound();
        animal1.run(10);
    }
}
