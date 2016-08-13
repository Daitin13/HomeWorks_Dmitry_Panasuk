package com.levelup.lesson4.task2;

public class Trucks extends Car{
    Status status;
    private int capacity;
    boolean alreadyDrive;
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
        System.out.println("Грузоподъемность машины = " + getCapacity());
    }
}
