package Shapes;

import BasicShapes.ThreePlaneShape;

public class Triangle extends ThreePlaneShape{

    public Triangle(int height, int ground) {
        super(height, ground);
    }


    public double square(int height, int ground) {
        return 0.5 * height*ground;
    }
}
