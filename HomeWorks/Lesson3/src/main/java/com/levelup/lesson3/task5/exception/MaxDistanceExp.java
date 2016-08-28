package com.levelup.lesson3.task5.exception;

public class MaxDistanceExp extends RuntimeException{
    private static final String DEFAULT_MESSAGE = "exceeded the maximum distance";

    public MaxDistanceExp(String message) {
        super(DEFAULT_MESSAGE +  message);
    }

    public MaxDistanceExp() {
        super(DEFAULT_MESSAGE);
    }
}
