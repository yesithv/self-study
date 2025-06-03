package yesithv.oop.pilars.polymorphism;

/**
 * POLYMORPHISM
 * Means "many forms": This allows us to perform a single action in different ways
 * It's useful for code reusability: reuse attributes and methods of an existing class when you create a new class
 */
public class Polymorphism {

    /*
      Override = run-time polymorphism => INHERITANCE
      The method in the subclass must have the same signature as in the superclass.
      It allows the subclass to modify the inherited methods.
     */

    /**
     * OverLoading = compile-time polymorphism
     * Allows different methods to have the same name, but different signatures where
     * the signature can differ by the number of input parameters or type of input parameters,
     * or a mixture of both.
     */
    public static void main(String[] args) {
        TheSum sum = new TheSum();
        System.out.println(sum.doTheSum());
        System.out.println("sum = " + sum.doTheSum(2, 4));
        System.out.println("sum = " + sum.doTheSum(2, 4, 5));
        System.out.println("sum = " + sum.doTheSum(1.3, 6.2));
    }
}
