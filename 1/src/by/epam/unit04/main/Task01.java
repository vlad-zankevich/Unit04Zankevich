package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
    public static void main(String[] args) {

        //Here a sequence of numbers is initiated:
        Random rand = new Random();
        int n = rand.nextInt(1000);
        int[] mas = new int[n];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = rand.nextInt();
        }

        //here the number of even numbers in the array is counted
        int q = 0;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 0) {
                q++;
            }
        }

        if (q == 0) {
            System.out.println("There are no even numbers in this sequence");
        }else {
            int a = 0;
            int[] mas2 = new int[q];
            for (int i = 0; i < mas.length; i++) {
                if (mas[i] % 2 == 0) {
                    mas2[a] = mas[i];
                    a++;
                }
            }
            for (int j = 0; j < mas2.length; j++) {
                System.out.println(mas2[j]);
            }
        }
    }
}

