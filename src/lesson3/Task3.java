package lesson3;

import java.util.Arrays;

public class Task3 {
    public Task3() {
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{23, 45, 55, 56, 38};
        int[] array2 = new int[]{44, 86, 17, 18, 55};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int sum1 = 0;

        for(int x = 0; x < array1.length; ++x) {
            sum1 += array1[x];
        }

        double average1 = (double)(sum1 / array1.length);
        System.out.println("Average of array 1: " + average1);
        int sum2 = 0;

        for(int y = 0; y < array2.length; ++y) {
            sum2 += array2[y];
        }

        double average2 = (double)(sum2 / array2.length);
        System.out.println("Average of array 2: " + average2);
        if (average1 > average2) {
            System.out.println("average of array 1 > average of array 2");
        } else if (average1 < average2) {
            System.out.println("average of array 1 < average of array 2");
        } else {
            System.out.println("average of array 1 = average of array 2");
        }

    }
}