package lesson7.task2;

public class Worker implements Printable
{
    private String name;
    private String position;

    public Worker(String name, String position)
    {
        this.name = name;
        this.position = position;
    }

    @Override
    public void printPosition()
    {
        System.out.println(name + "'s position is " + position);
    }
}
