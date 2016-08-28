package com.levelup.lesson3.task5.board;

import com.levelup.lesson3.task5.exception.MaxJumpCountExp;

public class Board {
    private String manufacturer;
    private int jumpCount;
    private TypeBoard typeBoard;

    public Board() {
        typeBoard = TypeBoard.WOOD;
    }

    public Board(String manufacturer, TypeBoard typeBoard) {
        this.manufacturer = manufacturer;
        this.typeBoard = typeBoard;
    }

    public Board(String manufacturer, int jumpCount, TypeBoard typeBoard) {
        this.manufacturer = manufacturer;
        this.jumpCount = jumpCount;
        this.typeBoard = typeBoard;
    }

    public TypeBoard getTypeBoard() {
        return typeBoard;
    }

    public void setTypeBoard(TypeBoard typeBoard) {
        this.typeBoard = typeBoard;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getJumpCount() {
        return jumpCount;
    }

    public void setJumpCount(int jumpCount) {
        this.jumpCount = jumpCount;
    }

    public boolean jump()throws MaxJumpCountExp {
        jumpCount++;
        if (jumpCount >= typeBoard.getMaxJumpCount()) {
            throw new MaxJumpCountExp();
        }
        return true;
    }

    public boolean checkBoard() {
        return jumpCount < typeBoard.getMaxJumpCount();
    }

    @Override
    public String toString() {
        return "Board{" +
                "manufacturer='" + manufacturer + '\'' +
                ", jumpCount=" + jumpCount +
                ", typeBoard=" + typeBoard +
                '}';
    }

}
