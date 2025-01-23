package yesithv.solid.liskovsubstitution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Square implements Shape {
    private int side;

    @Override
    public double getArea() {
        return side * side;
    }
}
