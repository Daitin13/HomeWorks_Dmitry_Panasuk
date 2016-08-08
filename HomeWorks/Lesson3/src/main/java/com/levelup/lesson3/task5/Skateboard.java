package com.levelup.lesson3.task5;

import java.util.Arrays;

public class Skateboard {
    Wheel kolesa[] = new Wheel[4];
    Board doska = new Board();
    private int countDistance = 0;

    @Override
    public String toString() {
        return "Skateboard{" +
                "kolesa=" + Arrays.toString(kolesa) +
                ", doska=" + doska +
                ", countDistance=" + countDistance +
                '}';
    }

    void addkolesa() {
        for (int i = 0; i < kolesa.length; i++) {
            kolesa[i] = new Wheel();
        }
    }

    public Skateboard(Wheel[] kolesa, Board doska, int countDistance) {
        this.kolesa = kolesa;
        this.doska = doska;
        this.countDistance = countDistance;
    }

    public Skateboard() {

    }

    public int getCountDistance() {
        return countDistance;
    }

    public void setCountDistance(int countDistance) {
        this.countDistance = countDistance;
    }

    boolean moveSkateboard() {
        if (kolesa[0].getWorn() >= 100) {
            System.out.println("Требуеться замена колес");
            return false;
        }
        if (doska.getWorn() >= 100) {
            System.out.println("Требуеться замена доски");
            return false;
        } else {
            countDistance++;
            System.out.println("Проехал вперед");
                kolesa[0].setWorn1(1);
            return true;
        }
    }

    boolean jampSkateboard(){
        if (kolesa[0].getWorn() >= 100) {
            System.out.println("Требуеться замена колес");
            return false;
        }
        if (doska.getWorn() >= 100) {
            System.out.println("Требуеться замена доски");
            return false;
        } else {
            countDistance++;
            System.out.println("Прыгнул");
            doska.setWorn(doska.getWorn() + 1);
            return true;
        }
    }

    void newWheels() {
        for (int i = 0; i < kolesa.length; i++) {
            kolesa[i].setWorn(0);
        }
            System.out.println("Поставили новые колека");
    }

    void newBoard() {
        doska.setWorn(0);
        System.out.println("Поставили новую доску");
    }

    void checkWheels() {
        System.out.println("Износ колес = " + kolesa[0].getWorn() + "%");
    }

    void checkBoard() {
        System.out.println("Износ Доски = " + doska.getWorn() + "%");
    }

    public static void main(String[] args) {
        Skateboard skateboard = new Skateboard();
        skateboard.addkolesa();
        skateboard.checkBoard();
        skateboard.checkWheels();
        skateboard.moveSkateboard();
        skateboard.jampSkateboard();
        skateboard.checkWheels();
        skateboard.checkBoard();
        skateboard.moveSkateboard();
        skateboard.jampSkateboard();
        skateboard.checkWheels();
        skateboard.checkBoard();
        skateboard.newWheels();
        skateboard.newBoard();
        skateboard.checkWheels();
        skateboard.checkBoard();
    }


}