package com.levelup.lesson5.Task1;

import java.util.Date;

public abstract class AbstractParticipant implements IParticipant {
    protected String name;
    protected int result;
    protected Status status;

    public AbstractParticipant(Status status) {
        this.status = status;
    }

    public AbstractParticipant() {
        this.status = Status.READY;
    }

    public AbstractParticipant(String name, int result) {
        this.name = name;
        this.result = result;
        this.status = Status.READY;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public boolean onStartLine() {
        if (status.equals(Status.READY)) {
            System.out.println("подошел на стартовую линию");
            status = Status.GO;
            return true;
        }
        return false;
    }

    public boolean go() {
        if (status.equals(Status.GO)) {
        System.out.println("Побежал");
        status = Status.FINISH;
        return true;
        }
        return false;
    }

    public boolean finish() {
        if (status.equals(Status.FINISH)) {
            System.out.println("Прибежал");
            Date date = new Date();
            setResult(date.getSeconds());
            return true;
        }
        return false;
    }

    public void checkResult() {
        System.out.println("Результат = " + getResult() + "сек");
    }

    public void start() {
        if (status == status.READY) {
            onStartLine();
            if (status == status.GO) {
                go();
                if (status == status.FINISH) {
                    finish();
                }
            }
        }
    }
}
