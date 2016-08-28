package com.levelup.lesson3.task5.exception;

public class MaxJumpCountExp extends RuntimeException{
    private static final String DEFAULT_MESSAGE = "out of jump count";

    public MaxJumpCountExp(String message) {
        super(DEFAULT_MESSAGE +  message);

    }

    public MaxJumpCountExp() {
        super(DEFAULT_MESSAGE);
        System.out.println(DEFAULT_MESSAGE);
    }
}
