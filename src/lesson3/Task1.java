package lesson3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public Task1() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 22, 33, 55};
        ArrayList<Integer> arr_new = new ArrayList();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = keyboard.nextInt();

        for(int i = 0; i < arr.length; ++i) {
            if (arr[i] != num) {
                arr_new.add(arr[i]);
            }
        }

        System.out.println(arr_new);
    }
}
