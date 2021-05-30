package by.epam.unit04.main;

import java.util.Random;

public class Task05 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rand = new Random();

        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(1000);
        }

        for(int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
        System.out.println();

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while(j >= 0 && temp < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }

        for(int i = 0; i < array.length; i++) {
            System.out.printf("%4d", array[i]);
        }
    }
}
