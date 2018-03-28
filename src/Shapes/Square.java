package Shapes;

import BasicShapes.FourPlaneShape;

public class Square extends FourPlaneShape{


    public Square(int length, int width) {
        super(length, width);
    }


    public int square(int length, int width) {
        return length * width;
    }
}
