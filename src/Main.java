import Shapes.Round;
import Shapes.Square;
import Shapes.Triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main (String[] args)
    {
    Scanner scanner = new Scanner(System.in);


    int chooseParameter;
    int firstParameter;
    int secondParameter;

    try {
        System.out.println("Choose your shape: 1 for Square, 2 for Round, 3 for Triangle");
        chooseParameter = scanner.nextInt();

        if(chooseParameter==1)
        {
            System.out.println("Put in width and length of your Square");
            firstParameter = scanner.nextInt();
            secondParameter = scanner.nextInt();
            Square square = new Square(firstParameter,secondParameter);
            System.out.println(square.square(firstParameter,secondParameter));
        }

        else if (chooseParameter == 2)
        {
            System.out.println("Put in radius of your Round");
            firstParameter = scanner.nextInt();
            Round round = new Round(firstParameter);
            System.out.println(round.square(firstParameter));
        }

        else if (chooseParameter == 3)
        {
            System.out.println("Put in ground and height of your Triangle");
            firstParameter = scanner.nextInt();
            secondParameter = scanner.nextInt();

            Triangle triangle = new Triangle(firstParameter,secondParameter);
            System.out.println(triangle.square(firstParameter,secondParameter));

        }
    }
    catch (InputMismatchException i)
    {
        System.out.println("Please put in the right integer");
    }


    }
}
