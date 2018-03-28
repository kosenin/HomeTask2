import BasicShapes.BasicShape;
import Shapes.Round;
import Shapes.Square;
import Shapes.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int chooseParameter;
        double first;
        double second;

        try {
            System.out.println("Choose your shape: 1 for Square, 2 for Round, 3 for Triangle");
            chooseParameter = scanner.nextInt();

            if (chooseParameter == 1) {
                System.out.println("Put in width and length of your Square");
                first = scanner.nextDouble();
                second = scanner.nextDouble();
                Square square = new Square(first, second);
                square.area();
            } else if (chooseParameter == 2) {
                System.out.println("Put in radius of your Round");
                first = scanner.nextDouble();
                Round round = new Round(first);
                round.area();
            } else if (chooseParameter == 3) {
                System.out.println("Put in ground and height of your Triangle");
                first = scanner.nextDouble();
                second = scanner.nextDouble();

                Triangle triangle = new Triangle(first, second);
                triangle.area();

            }
        } catch (InputMismatchException i) {
            System.out.println("Please put in the right integer");
        }


    }
}
