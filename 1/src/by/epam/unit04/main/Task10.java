package by.epam.unit04.main;

import java.util.Random;

public class Task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        int m = (n * 2 + 4);

        int [][] mas = new int[m][m];

        for (int j = 0; j < mas[0].length; j++) {
            mas[0][j] = 1;
            mas[m - 1][j] = 1;
        }

        for (int i = 1; i < (mas.length - 1); i++) {
            mas[i][0] = 1;
        }

        for (int i = 1; i < (mas.length - 1); i++) {
            mas[i][m - 1] = 1;
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf(" %1d ", mas[i][j]);
            }
            System.out.println();
        }
    }
}
