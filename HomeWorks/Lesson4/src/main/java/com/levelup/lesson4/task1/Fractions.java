package com.levelup.lesson4.task1;


public class Fractions {
    long a;
    double b;

    public Fractions() {
    }

    public Fractions(long a, double b) {
        this.a = a;
        this.b = b;
    }

    public long getA() {
        return a;
    }

    public void setA(long a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if (b>0&&b<1)
        this.b = b;
    }

    @Override
    public String toString() {
        return "Fractions =" + a + b;
    }
}
