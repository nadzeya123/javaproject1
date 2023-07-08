package lesson2;

public class Task1
{
    public static void main(String[] args)
    {
        int num = 5;

        switch (num) {
            case 12, 1, 2:
                System.out.println("Winter");
                break;
            case 3, 4, 5:
                System.out.println("Spring");
                break;
            case 6, 7, 8:
                System.out.println("Summer");
                break;
            case 9, 10, 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Pick a number between 1 and 12.");
        }
    }
}
