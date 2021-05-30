package by.epam.unit04.main;

import java.util.Random;

public class Task02 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(100);
        double [] mas = new double[n];
        double min;
        double max;


        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextDouble();
        }

        min = mas[0];
        for (int j = 1; j < mas.length; j++) {
            if (mas[j] < min) {
                min = mas[j];
            }
        }

        max = mas[0];
        for (int k = 1; k < mas.length; k++) {
            if (mas[k] > max) {
                max = mas[k];
            }
        }

        double axeLength = max - min;
        System.out.println("The Min value in the mas = " + min);
        System.out.println("The Max value in the mas = " + max);
        System.out.println("The smallest length of the numeric axis containing all numbers" +
            " in this sequence of numbers = " + axeLength);
    }
}
