package by.epam.unit04.main;

import java.util.Random;

public class Task08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = 10;
        int m = 10;
        int k = 5;
        int p = 7;

        int [][] mas = new int[m][n];
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                mas[i][j] = rand.nextInt(999);
            }
        }

        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < mas[i].length; j++) {
                System.out.printf("[%3d]", mas[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for (int j = 0; j < mas[k].length; j++) {
            System.out.printf("[%3d]", mas[k][j]);
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            System.out.printf("[%4d]", mas[i][p]);
            System.out.println();
        }
    }
}
