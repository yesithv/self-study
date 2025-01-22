package yesithv.oop.encapsulation;

/**
 * ENCAPSULATION:
 * State and behaviour is hidden from users: Declare private field and provide public methods
 */
public class Encapsulation {

    public static void main(String[] args) {
        Area rectangle = new Area(4, 3);
        rectangle.calculateArea();
        System.out.println("The rectangle area is = " + rectangle.getResult());
    }
}