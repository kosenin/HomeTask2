package Shapes;

import BasicShapes.RoundShape;

public class Round extends RoundShape {

    double PI = Math.PI;

    public Round(int radius) {
        super(radius);
    }

    public double square(int radius) {
        return (radius * radius) * PI;
    }
}
