package com.company;

public class task_2 {

    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.printf("%d * %d = %d \t\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
