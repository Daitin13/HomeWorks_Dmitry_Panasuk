package com.levelup.lesson4.task2;

public abstract class Car {
    private String color;
    private int wheels;
    private int doors;
    private int oil;

    public enum Status {OK, NEED_OIL, DRIVE}

    public Car() {
    }

    public Car(String color, int wheels, int doors, int oil) {
        this.color = color;
        this.wheels = wheels;
        this.doors = doors;
        this.oil = oil;
    }

    public int getOil() {
        return oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean drive() {
        if (preDrive() && onDrive()) {
            return true;
        } else return false;
    }

    public abstract boolean preDrive();

    public abstract boolean onDrive();

    public abstract boolean stopDrive();

}
