package com.levelup.lesson1.task1;

import java.util.Scanner;

class Input {
    private double a, b;
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public void scun() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        a = scan.nextDouble();
        System.out.println("Введите второе число");
        b = scan.nextDouble();
        System.out.println("Что сделать? (+ - / * ^)");
        str = scan.nextLine();
    }
}
