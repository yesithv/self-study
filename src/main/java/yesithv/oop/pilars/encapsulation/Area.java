package yesithv.oop.encapsulation;

public class Area {

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
