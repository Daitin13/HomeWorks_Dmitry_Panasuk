package com.levelup.lesson3.task5;

public class Wheel {
    private static int worn;//изношенность
    private String manufacturer;//фирма производитель
    private String type;

    public Wheel(int worn, String manufacturer, String type) {
        this.worn = worn;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public Wheel() {
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "worn=" + worn +
                ", manufacturer='" + manufacturer + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public int getWorn() {
        return worn;
    }

    public void setWorn(int worn) {
        this.worn = worn;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
