package lesson7.task1;

public class Triangle implements GeometricShape
{
    private double side1;
    private double side2;
    private double base;
    private double height;

    public Triangle(double side1, double side2, double base, double height)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea()
    {
        double area = (base * height) / 2;
        return area;
    }

    @Override
    public double calculatePerimeter()
    {
        double perimeter = side1 + base + side2;
        return perimeter;
    }
}
