package com.levelup.lesson3.task2;

public class Ychet {
    private String nameWorker;
    private int quantityPen;
    private int coastPen = 2;
    private int quantityPencil;
    private int coastPencil = 1;
    private int quantityStapler;
    private int coastStapler = 5;

    public Ychet() {
    }

    public String getNameWorker() {
        return nameWorker;
    }

    public void setNameWorker(String nameWorker) {
        this.nameWorker = nameWorker;
    }

    public int getQuantityPen() {
        return quantityPen;
    }

    public void setQuantityPen(int quantityPen) {
        this.quantityPen = quantityPen;
    }

    public int getCoastPen() {
        return coastPen;
    }

    public int getQuantityPencil() {
        return quantityPencil;
    }

    public void setQuantityPencil(int quantityPencil) {
        this.quantityPencil = quantityPencil;
    }

    public int getCoastPencil() {
        return coastPencil;
    }

    public int getQuantityStapler() {
        return quantityStapler;
    }

    public void setQuantityStapler(int quantityStapler) {
        this.quantityStapler = quantityStapler;
    }

    public int getCoastStapler() {
        return coastStapler;
    }

    public int allCoast() {
        int sum = getCoastPen() * getQuantityPen();
        sum += getCoastPencil() * getQuantityPencil();
        sum += getCoastStapler() * getQuantityStapler();
        return sum;
    }

    public static void main(String[] args) {
        Ychet vasiliy = new Ychet();
        vasiliy.setNameWorker("Vasya");
        vasiliy.setQuantityPen(5);
        vasiliy.setQuantityPencil(4);
        vasiliy.setQuantityStapler(2);
        System.out.println(vasiliy.getNameWorker());
        System.out.println(vasiliy.allCoast()+"$");
    }
}
