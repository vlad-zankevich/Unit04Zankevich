package by.epam.unit04.main;

import java.util.Random;

public class Task04 {
    public static void main(String[] args) {
        int [] mas = new int[10];
        Random rand = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(999);
        }

        for (int j = 0; j < mas.length; j++) {
            System.out.printf("%3d", mas[j]);
        }
        System.out.println();

        int max, temp;
        for(int a = 0; a < mas.length - 1; a++) {
            max = a;

            for (int j = a +1; j < mas.length; j++) {
                if (mas[j] > mas[max]) {
                    max = j;
                }
            }
            temp = mas[a];
            mas[a] = mas[max];
            mas[max] = temp;
        }

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("%3d", mas[i]);
        }
        System.out.println();

    }
}
