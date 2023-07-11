package lesson4;

import java.util.Arrays;

public class Task1
{
        public static void main(String[] args)
        {
            String arr[][] = new String[8][8];

            for (int i = 0; i < arr.length; i++)
            {
                for (int j = 0; j < arr[i].length; j++)
                {
                    if (i % 2 == 1 && j % 2 == 1)
                    {
                        arr[i][j] = "W";
                    }
                    else if (i % 2 != 1 && j % 2 != 1)
                    {
                        arr[i][j] = "W";
                    }
                    else if (i % 2 == 1 && j % 2 != 1)
                    {
                        arr[i][j] = "B";
                    }
                    else if (i % 2 != 1 && j % 2 == 1)
                    {
                        arr[i][j] = "B";
                    }
                }
            }

            System.out.println(Arrays.deepToString(arr));
        }
}
