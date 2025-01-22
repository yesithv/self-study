package yesithv.oop.encapsulation;

/**
 * ENCAPSULATION:
 * State and behaviour is hidden from users: Declare private field and provide public methods
 */
class Area {
    private int width;
    private int height;
    private int result;

    Area(int width, int height) {
        this.width = width;
        this.height = height;
        this.result = 0;
    }

    public int getResult() {
        return this.result;
    }

    public void calculateArea() {
        this.result = this.width * this.height;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Area rectangle = new Area(4, 3);
        rectangle.calculateArea();
        System.out.println("The rectangle area is = " + rectangle.getResult());
    }
}