package yesithv.oop.inheritance;

public class Duck extends Walk implements Fly, Swim {

    @Override
    public void flying() {
        System.out.println("Duck is flying ...");
    }

    @Override
    public void swiming() {
        System.out.println("Duck is swiming ...");
    }
}
