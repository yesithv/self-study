package yesithv.oop.abstraction.withinterfaces;

public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Pig noise Oig Oig Oig ");
    }

    @Override
    public void run(double velocity) {
        System.out.println("Pig velocity = " + velocity);
    }
}
