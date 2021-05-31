package by.epam.unit04.main;

import java.util.Random;

public class Task09 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(10);
        int m = n * 2 + 2;

        int [][] mas = new int[m][m];

        int k = 1;
        for (int i = 0; i < mas.length; i++) {
            mas[i][m - 1] = k;
            m--;
            k++;
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%3d]", mas[i][j]);
            }
            System.out.println();
        }
    }
}
