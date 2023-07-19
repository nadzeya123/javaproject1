package lesson7.task1;

import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        GeometricShape circle1 = new Circle(2d);
        GeometricShape circle2 = new Circle(3d);
        GeometricShape rectangle1 = new Rectangle(1d, 2d);
        GeometricShape rectangle2 = new Rectangle(3d, 4d);
        GeometricShape triangle1 = new Triangle(2d, 2d, 3d,2.5d);


        GeometricShape[] array = {circle1, circle2, rectangle1, rectangle2, triangle1};

        double sum = 0;

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i].calculatePerimeter();
        }

        System.out.println("Sum of geometric shapes perimeters is " + sum);
    }
}
