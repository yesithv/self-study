package yesithv.oop.nonaccessmodifiers.forclasses;

public abstract class AbstractClass {

    abstract void abstractMethod();

    void nonAbstractMethod() {
        System.out.println("Hello non abstract method from abstractClass");
    }
}
