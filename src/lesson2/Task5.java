package lesson2;

public class Task5
{
    public static void main(String[] args)
    {
        int num = 0;

        switch (num)
        {
            case 1:
                System.out.println("red");
                break;
            case 2:
                System.out.println("orange");
                break;
            case 3:
                System.out.println("yellow");
            case 4:
                System.out.println("green");
                break;
            case 5:
                System.out.println("blue");
                break;
            case 6:
                System.out.println("indigo");
                break;
            case 7:
                System.out.println("violet");
                break;
            default:
                System.out.println("Pick a number between 1 and 7.");
        }
    }
}
