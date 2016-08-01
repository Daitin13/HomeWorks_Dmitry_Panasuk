package com.levelup.lesson1.task3;

import java.util.Scanner;

class Entry3 {
    public static void main(String[] args) {
        double F;
        double a, b, h;
        Scanner scan = new Scanner(System.in);
        System.out.println("Начало диапазона?");
        a = scan.nextDouble();
        System.out.println("Конец диапазона?");
        b = scan.nextDouble();
        System.out.println("Шаг ?");
        h = scan.nextDouble();
        do {
            F = Math.tan((2 * a) - 3);
            System.out.println(a + "       " + F);
            a += h;
        } while (a <= b);
    }
}
