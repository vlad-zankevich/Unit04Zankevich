package by.epam.unit04.main;

import java.util.Random;

public class Task06 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(20);
        int m = rand.nextInt(20);

        int [][] mas = new int[n + 1][m + 1];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(50);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%2d]", mas[i][j]);
            }
            System.out.println();
        }

        int count = 0;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (mas[i][j] == 7) {
                    count++;
                }
            }
        }

        System.out.println();
        System.out.println("The number of '7' in the array = " + count);
    }
}
