package yesithv.solid.liskovsubstitution;


public class Square extends Rectangle {

    private int side;

    public Square(int side) {
        super(side, side);
    }
}
