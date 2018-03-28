package Shapes;

import BasicShapes.BasicShape;

public class Triangle extends BasicShape {

    public Triangle(double parameterOne, double parameterTwo) {
        super(parameterOne, parameterTwo);
    }

    public void area() {
        System.out.println("Area of the given Triangle is " + 0.5 * dimensionOne * dimensionTwo);
    }
}
