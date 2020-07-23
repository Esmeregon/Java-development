package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

public class task_3 {
    public static void main(String[] args) {
        int[] array = new int[30];
        System.out.println("Пункт 1");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 2000) - 999);
            System.out.printf("Элемент массива %d: %d \n", i + 1, array[i]);
        }

        System.out.println("\n\nПункт 2");

        System.out.println("\n\nПункт 3");
        for (int value : array) {
            if (value % 2 == 0) {
                System.out.printf("Четный элемент: %d; итог: %d \n", value, value / 2);
            } else {
                System.out.printf("Нечетный элемент: %d; итог: %d \n", value, value * 3);
            }

        }
        System.out.println("\n\nПункт 4");
        int max = array[1];

        for(int i = 1; i < array.length; i+=2) {
            if (array[i] > max)
                max = array[i];
                    }
        System.out.printf("Максимальное число: %d", max);

        System.out.println("\n\nПункт 5");
        int min = array[0];

        for(int i = 0; i < array.length; i+=2) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.printf("Минимальное число: %d", min);
    }
}