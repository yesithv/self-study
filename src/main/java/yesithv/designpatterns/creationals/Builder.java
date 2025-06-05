package yesithv.designpatterns.creationals;

/**
 * Builder is a creational design pattern that lets you construct complex objects step by step.
 * The pattern allows you to produce different types and representations of an object using the same
 * construction code.
 */
public class Builder {
    // Problem: To create a complex object with several fields, so create a constructor with a lot of parameters
    // House:  H + Garage; H + Poll; H + Garden
    // Solution: Extract the object construction and create specific Builders
    // Director - Builder
    // ConcreteBuilder1 - ConcreteBuilder2 - ConcreteBuilderN
    //     Product1    -     Product2     -     ProductN
}
