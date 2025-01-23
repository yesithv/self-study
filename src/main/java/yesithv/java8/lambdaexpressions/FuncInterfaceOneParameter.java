package yesithv.java8.lambdaexpressions;

/**
 * FUNCTIONAL INTERFACE
 * An interface with single abstract method
 */
public interface FuncInterfaceOneParameter {

    // An abstract function
    void abstractFun(int x);

    // A non-abstract (or default) function
    default void normalFun() {
        System.out.println("Hello from normalFun");
    }
}
