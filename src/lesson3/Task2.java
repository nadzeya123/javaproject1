package lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = keyboard.nextInt();
        Random rd = new Random();
        int[] arr = new int[num];

        int sum;
        for(sum = 0; sum < arr.length; ++sum) {
            arr[sum] = rd.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }

        double average = (double)(sum / arr.length);
        System.out.println("average of array: " + average);
        int max = arr[0];
        int min = arr[0];

        for(int i = 1; i < arr.length; ++i) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("maximum of array: " + max);
        System.out.println("minimum of array: " + min);
    }
}

