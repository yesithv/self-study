package yesithv.oop.abstraction.withinterfaces;

public class Bird implements Animal{

    @Override
    public void animalSound() {
        System.out.println("Bird sound is fly fly fly");
    }

    @Override
    public void run(double velocity) {
        // Its static and final
        // maxLivingAge = 20;
        System.out.println("Bird velocity = " + (velocity - maxLivingAge));
    }
}
