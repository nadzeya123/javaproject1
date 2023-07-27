package lesson7.task1;


public class Rectangle implements GeometricShape
{
    private double length;
    private double width;

    public Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea()
    {
        double area = length * width;
        return area;
    }

    @Override
    public double calculatePerimeter()
    {
        double perimeter = 2 * (length + width);
        return perimeter;
    }
}
