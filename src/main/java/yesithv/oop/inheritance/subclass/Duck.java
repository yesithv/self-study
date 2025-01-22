package yesithv.oop.inheritance.subclass;

import yesithv.oop.inheritance.superclass.Fly;
import yesithv.oop.inheritance.superclass.Swim;
import yesithv.oop.inheritance.superclass.Walk;

public class Duck extends Walk implements Fly, Swim {

    @Override
    public void flying() {
        System.out.println("The duck is flying ...");
    }

    @Override
    public void swiming() {
        System.out.println("The duck is swiming ...");
    }
}
