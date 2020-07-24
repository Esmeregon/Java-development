package com.company;


public class task_3 {
    public static void main(String[] args) {

//1. Вывести массив в консоль.
        System.out.println("Пункт 1");
        int [] array = {-23, 56, 1, -421, 5, 100, 34, 95, -153, -953, 100, 321, 932, 0, 932, -1, 9, -11, 99, -101, 15, 328, 481, 424, -92, -124, 24, 7, 78, 921};
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Элемент массива %d: %d \n", i + 1, array[i]);
        }


//2. Вывести в консоль факториалы всех однозначных чисел больше 0 из исходного массива.
        System.out.println("\n\nПункт 2");
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0  && array[i] <= 10) {
                int result = 1;
                for (int j = 1; j <= array[i]; j++) {
                    result = result * j;
                }
                System.out.printf("Факториал %d равен %d \n", array[i], result);
            }
        }


//3. Вывести в консоль все двузначные числа перед этим разделив на 2 все четные и умножив на 3 все нечетные среди них.
        System.out.println("\n\nПункт 3");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 9 && array[i] < 100) {
                if (array[i] % 2 == 0) {
                    System.out.printf("Четный элемент: %d; итог: %d \n", array[i], array[i] / 2);
                } else {
                    System.out.printf("Нечетный элемент: %d; итог: %d \n", array[i], array[i] * 3);
                }
            }
        }


//4. Вывести в консоль максимальное трехзначное число из тех, что стоят на нечетных местах (местах с нечетным номером).
        System.out.println("\n\nПункт 4");
        int max = array[1];
        for(int i = 1; i < array.length; i+=2) {
            if (array[i] <= -100 || array[i] >=100) {
                if (array[i] > max)
                    max = array[i];
            }
        }
        System.out.printf("Максимальное число: %d", max);


//5. Вывести в консоль минимальное трехзначное число из тех, что стоят на четных местах (местах с четным номером).
        System.out.println("\n\nПункт 5");
        int min = array[0];
        for(int i = 0; i < array.length; i+=2) {
            if (array[i] <= -100 || array[i] >=100) {
                if (array[i] < min)
                    min = array[i];
            }
        }
        System.out.printf("Минимальное число: %d", min);
    }
}
