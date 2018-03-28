package BasicShapes;

/**
 * Created by Konstantin2 on 28.03.2018.
 */
public class BasicShape {

    protected double dimensionOne;
    protected double dimensionTwo;

    protected BasicShape(double parameterOne, double parameterTwo) {
        this.dimensionOne = parameterOne;
        this.dimensionTwo = parameterTwo;
    }

    protected BasicShape(double parameterOne) {
        this.dimensionOne = parameterOne;
    }

    public void area() {

    }


}
