package com.levelup.lesson3.task5.board;

public enum TypeBoard {
    WOOD(100), CARBON(200), PLASTIC(150);
    private final int maxJumpCount;

    TypeBoard(int maxJumpCount) {
        this.maxJumpCount = maxJumpCount;
    }

    public int getMaxJumpCount() {
        return maxJumpCount;
    }

}
