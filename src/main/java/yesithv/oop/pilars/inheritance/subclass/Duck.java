package yesithv.oop.pilars.inheritance.subclass;

import yesithv.oop.pilars.inheritance.superclass.Fly;
import yesithv.oop.pilars.inheritance.superclass.Swim;
import yesithv.oop.pilars.inheritance.superclass.Walk;

public class Duck extends Walk implements Fly, Swim {

    @Override
    public void flying() {
        System.out.println("The duck is flying ...");
    }

    @Override
    public void swimming() {
        System.out.println("The duck is swimming ...");
    }
}
