package com.levelup.lesson1;

import java.util.Scanner;

public class Input {
    private double a, b;
    private String str;

    public Input(double a, double b, String str) {
        this.a = a;
        this.b = b;
        this.str = str;
    }

    public Input() {
       scun();
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public String getStr() {
        return str;
    }

    public void scun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = scan.nextDouble();
        System.out.println("Введите второе число");
        b = scan.nextDouble();
        System.out.println("Что сделать? (+ - / * ^)");
        str = scan.next();

    }
}
