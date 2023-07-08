package lesson2;

public class Task2
{
    public static void main(String[] args)
    {
        int num = 2;

        if (num == 12 || num == 1 || num == 2)
        {
            System.out.println("Winter");
        } else if (num == 3 || num == 4 || num == 5)
        {
            System.out.println("Spring");
        } else if (num == 6 || num == 7 || num == 8)
        {
            System.out.println("Summer");
        } else if (num == 9 || num == 10 || num == 11)
        {
            System.out.println("Autumn");
        }
        else
        {
            System.out.println("Pick a number between 1 and 12.");
        }
    }
}