package com.levelup.lesson3.task3;

public class Matrica {

    public static void main(String[] args) {
        int matrica[][] = new int[5][];
        for (int i = 0; i < 5; i++) {
            matrica[i] = new int[5];
        }
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                if (i == j || i == (4 - j)) {
                    matrica[i][j] = 1;
                } else {
                    matrica[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica[i].length; j++) {
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
    }
}