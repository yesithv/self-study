package yesithv.oop.accessmodifiers.foratributesandmethods;

import yesithv.oop.accessmodifiers.foratributesandmethods.somepackage.SomeClass;

public class ForAttributesAndMethods {

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        // someClass.age AGE its default: Only accessible in the same package
        someClass.name = "SomeClass";
        // someClass.active  - ACTIVE its private: Only accessible in the same class
        // someClass.weight  - WEIGHT its protected
    }
}
