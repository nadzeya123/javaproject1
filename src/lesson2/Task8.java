package lesson2;

import java.util.Scanner;

public class Task8
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a random positive number.");
        int num = keyboard.nextInt();

        int sum = 0;
        for (int i = 1; i <= num; i++)
        {
            sum += i;
        }

        System.out.println(sum);
    }
}
