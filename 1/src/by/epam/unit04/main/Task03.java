package by.epam.unit04.main;

import java.util.Random;

public class Task03 {
    public static void main(String[] args) {

        Random rand = new Random();
        int n = rand.nextInt(10000);
        int mas[] = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt(2000) - 1000;
        }

        int neg = 0;
        for (int j = 0; j < mas.length; j++) {
            if (mas[j] < 0) {
                neg++;
            }
        }

        int pos = 0;
        for (int ma : mas) { //The IDE suggested me to write the code in such way :)
            if (ma > 0) {
                pos++;
            }
        }

        int zero = 0;
        for (int ma : mas) {
            if (ma == 0) {
                zero++;
            }
        }

        System.out.println("The mas length = " + mas.length);
        System.out.println("The number of positive elements = " + pos);
        System.out.println("The number of negative elements = " + neg);
        System.out.println("The number of element witch equal zero = " + zero);
    }
}
