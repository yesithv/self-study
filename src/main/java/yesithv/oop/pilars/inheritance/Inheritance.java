package yesithv.oop.pilars.inheritance;

import yesithv.oop.pilars.inheritance.subclass.Cat;
import yesithv.oop.pilars.inheritance.subclass.Duck;

/**
 * INHERITANCE:
 * It is the mechanism in Java by which one class is allowed to inherit the features (fields and methods) of another class
 * Do we need: Code reusability and method overriding
 */
public class Inheritance {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.walking();

        Duck duck1 = new Duck();
        duck1.walking();
        duck1.flying();
        duck1.swimming();
    }
}
