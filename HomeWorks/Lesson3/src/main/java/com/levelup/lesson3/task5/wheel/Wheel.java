package com.levelup.lesson3.task5.wheel;

import com.levelup.lesson3.task5.exception.MaxDistanceExp;

public class Wheel {
    private String manufacturer;
    private int distance;
    private TypeWheel typeWheel;

    public Wheel() {
        this.manufacturer = "Default";
        this.typeWheel = TypeWheel.ROLLING;
    }

    public Wheel(TypeWheel typeWheel, String manufacturer) {
        this.typeWheel = typeWheel;
        this.manufacturer = manufacturer;
    }

    public Wheel(String manufacturer, int distance, TypeWheel typeWheel) {
        this.manufacturer = manufacturer;
        this.distance = distance;
        this.typeWheel = typeWheel;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public TypeWheel getTypeWheel() {
        return typeWheel;
    }

    public void setTypeWheel(TypeWheel typeWheel) {
        this.typeWheel = typeWheel;
    }

    public boolean run(int distance, Side side) {
        this.distance += distance;
        if (this.distance >= typeWheel.getMaxDistance()) {
            throw new MaxDistanceExp();
        }
        return true;
    }

    public boolean checkWheels() {
        if (distance >= typeWheel.getMaxDistance()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "manufacturer='" + manufacturer + '\'' +
                ", distance=" + distance +
                ", typeWheel=" + typeWheel +
                '}';
    }
}
