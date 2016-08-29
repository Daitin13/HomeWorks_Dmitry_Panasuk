package com.levelup.lesson3.task5.skateboard;

import com.levelup.lesson3.task5.board.Board;
import com.levelup.lesson3.task5.wheel.Side;
import com.levelup.lesson3.task5.wheel.Wheel;

public class Skateboard implements ISkateBoard {
    private String name;
    private Wheel wheels[] = new Wheel[4];
    private Board board = new Board();
    private StatusSkateboard statusSkateboard;
    boolean stat;

    public Skateboard() {
        for (int i = 0; i < wheels.length; i++) {
            wheels[i] = new Wheel();
        }
    }

    public Skateboard(String name, Wheel[] wheels, Board board) {
        this.name = name;
        this.wheels = wheels;
        this.board = board;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public boolean setWheels(Wheel[] wheels) {
        this.wheels = wheels;
        return false;
    }

    public Board getBoard() {
        return board;
    }

    public boolean setBoard(Board board) {
        this.board = board;
        return false;
    }

    public boolean jump() {
        if (board.checkBoard()) {
            System.out.println("Я прыгнул!");
            statusSkateboard = StatusSkateboard.OK;
            return board.jump();
        }
        statusSkateboard = StatusSkateboard.NEED_REPLACEMENT_BOADR;
        System.out.println(statusSkateboard);
        return false;
    }

    public boolean drive(int distance, Side side) {

        for (Wheel wheel : wheels) {
            stat = wheel.checkWheels();
        }
        if (stat) {
            for (Wheel wheel : wheels) {
                wheel.run(distance, side);
            }
            System.out.println("Проехали " + distance + " метров");
            statusSkateboard = StatusSkateboard.OK;
            return true;
        }
        statusSkateboard = StatusSkateboard.NEED_REPLACEMEN_WHEEL;
        System.out.println(statusSkateboard);
        return false;
    }

    public void getStatus() {
        if (board.checkBoard()) {
            statusSkateboard = StatusSkateboard.OK;
            System.out.println("Board is " + statusSkateboard);
        } else {
            statusSkateboard = StatusSkateboard.NEED_REPLACEMENT_BOADR;
            System.out.println(statusSkateboard);
        }
        for (Wheel wheel : wheels) {
            stat = wheel.checkWheels();
        }
        if (stat) {
            statusSkateboard = StatusSkateboard.OK;
            System.out.println("Wheels is " + statusSkateboard);
        } else {
            statusSkateboard = StatusSkateboard.NEED_REPLACEMEN_WHEEL;
            System.out.println(statusSkateboard);
        }
    }

}