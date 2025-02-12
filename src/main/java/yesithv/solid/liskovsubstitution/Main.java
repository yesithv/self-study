package yesithv.solid.liskovsubstitution;

/**
 * LISKOV SUBSTITUTION:
 * Delivered classes must be completely substitutable for their base classes without debugging the program
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(3,5);
        System.out.println("Rectangle area = " + rectangle.getArea());

        Shape square = new Square(4);
        System.out.println("Square area = " + square.getArea());

        // The rectangle and Square class now implements the Shape interface, making them interchangeable
        // without altering the correctness of the program
    }
}
