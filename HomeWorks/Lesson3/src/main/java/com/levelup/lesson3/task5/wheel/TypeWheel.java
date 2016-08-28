package com.levelup.lesson3.task5.wheel;

public enum TypeWheel {
    ROLLING(1000), PLAIN(1500);
    private final int maxDistance;

    TypeWheel(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxDistance() {
        return maxDistance;
    }
}
