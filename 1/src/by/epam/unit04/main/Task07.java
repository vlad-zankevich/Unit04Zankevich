package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);

        int[][] mas = new int[n + 1][n + 1];

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(999);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%4d]", mas[i][j]);
            }
            System.out.println();
        }
        System.out.println();


        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                if (i == j) {
                    System.out.printf("[%4d]", mas[i][j]);
                }
            }
        }
    }
}
