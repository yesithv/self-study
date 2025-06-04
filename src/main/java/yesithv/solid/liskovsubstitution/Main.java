package yesithv.solid.liskovsubstitution;

/**
 * LISKOV SUBSTITUTION:
 * Delivered classes must be completely substitutable for their base classes without bugging the program
 */
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println("Rectangle area = " + rectangle.getArea());

        // Now we can change the Rectangle class by Square class
        // without altering the correctness of the program
        Square square = new Square(4);
        System.out.println("Square area = " + square.getArea());

    }
}
