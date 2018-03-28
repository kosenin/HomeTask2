package Shapes;


import BasicShapes.BasicShape;

public class Round extends BasicShape {


    public Round(double parameterOne) {
        super(parameterOne);
    }


    public void area() {
        System.out.println("Area of the given Round is " + Math.sqrt(dimensionOne) * Math.PI);


    }
}
