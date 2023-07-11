package lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class Task0
{
    public static void main(String[] args)
    {
        int arr[][][] = {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}};
        System.out.println("Original array is " + Arrays.deepToString(arr));

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to increase array elements.");
        int num = keyboard.nextInt();

        for(int a = 0; a < arr.length; a++)
        {
            for (int b = 0; b < arr[a].length; b++)
            {
                for (int c = 0; c < arr[a][b].length; c++)
                {
                    arr[a][b][c] += num;
                }
            }
        }

        System.out.println("Updated array is " + Arrays.deepToString(arr));
    }
}


