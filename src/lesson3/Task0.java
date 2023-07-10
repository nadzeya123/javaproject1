package lesson3;

import java.util.Scanner;

public class Task0 {
    public Task0() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{11, 22, 33, 44, 55};
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number.");
        int num = keyboard.nextInt();
        boolean test = false;
        int[] var5 = arr;
        int var6 = arr.length;

        for(int var7 = 0; var7 < var6; ++var7) {
            int i = var5[var7];
            if (i == num) {
                test = true;
                break;
            }
        }

        if (test) {
            System.out.println("Your number is in the array.");
        } else {
            System.out.println("Your number is NOT in the array.");
        }

    }
}

