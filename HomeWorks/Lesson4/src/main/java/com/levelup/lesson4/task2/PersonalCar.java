package com.levelup.lesson4.task2;

import com.sun.org.apache.xpath.internal.SourceTree;

public class PersonalCar extends Car {
    Status status;
    boolean alreadyDrive;
    private int power;
    private int numberOfSeats;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public boolean preDrive() {
        if (alreadyDrive) {
            System.out.println("Уже едем");
            return false;}
        else if (getOil() > 0) {
            status = Status.OK;
            return true;
        } else {
            status = Status.NEED_OIL;
            return true;
        }
    }

    public boolean onDrive() {

        if (status.equals(Status.OK)) {
            System.out.println("Поехали");
            setOil(getOil() - 1);
            alreadyDrive = true;
            return true;
        } else {
            System.out.println("Error: " + status);
            return false;
        }
    }

    public boolean stopDrive() {
        if (alreadyDrive) {
            System.out.println("STOP");
            alreadyDrive = false;
            return true;
        } else {
            System.out.println("И так стоим!!!");
            return false;
        }
    }

    public void info() {
        System.out.println("Цвет машины - " + getColor());
        System.out.println("Кол-во колес = " + getWheels());
        System.out.println("Кол-во дверей = " + getDoors());
        System.out.println("Запас топлива = " + getOil());
        System.out.println("Мощность машины = " + getPower());
        System.out.println("Кол-во сидений = " + getNumberOfSeats());
    }

}
