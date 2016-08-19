package com.levelup.lesson4.task2;

public class Crane extends Trucks {
    private int height;
    private String name;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Crane crane205 = new Crane();
        crane205.info();
        crane205.setOil(2);
        crane205.drive();
        crane205.stopDrive();
        crane205.stopDrive();
        crane205.drive();
        crane205.drive();
        crane205.info();
        crane205.stopDrive();
        crane205.drive();
    }
}
