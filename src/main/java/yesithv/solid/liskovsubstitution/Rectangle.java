package yesithv.solid.liskovsubstitution;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {

    private int width;
    private int height;

    @Override
    public double getArea() {
        return width * height;
    }
}
