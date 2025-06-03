package yesithv.oop.nonaccessmodifiers.forclasses;

public class ForClasses {

    public void foo() {
        /* Abstract class => not to create objects
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            void abstractMethod() {

            }
        }*/
    }

    public void bar() {
        FinalClass fc = new FinalClass();
        fc.OneReturn();
    }
}
