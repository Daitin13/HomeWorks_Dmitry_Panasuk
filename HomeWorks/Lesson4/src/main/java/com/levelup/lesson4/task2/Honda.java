package com.levelup.lesson4.task2;

public class Honda extends PersonalCar {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Honda "+name;
    }

    public static void main(String[] args) {
        Honda hondaRX3 = new Honda();
        hondaRX3.setColor("Red");
        hondaRX3.setName("RX3");
        hondaRX3.setWheels(4);
        hondaRX3.setDoors(5);
        hondaRX3.setPower(250);
        hondaRX3.setOil(2);
        hondaRX3.info();
        hondaRX3.drive();
        hondaRX3.stopDrive();
        hondaRX3.drive();
        hondaRX3.drive();
        hondaRX3.stopDrive();
        hondaRX3.stopDrive();
        hondaRX3.drive();



        //hondaRX3.info();


    }
}