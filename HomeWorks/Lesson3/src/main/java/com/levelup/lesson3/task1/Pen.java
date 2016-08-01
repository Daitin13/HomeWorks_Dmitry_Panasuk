package com.levelup.lesson3.task1;

public class Pen {
    String color;
    String nameProduction;
    String colorOfInk;
    Boolean disposable;

    public Pen(String color) {
    }

    public Pen(String color, String nameProduction, String colorOfInk, Boolean disposable) {
        this.color = color;
        this.nameProduction = nameProduction;
        this.colorOfInk = colorOfInk;
        this.disposable = disposable;
    }

    private void write(String s) {
        System.out.println(s);
    }

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", nameProduction='" + nameProduction + '\'' +
                ", colorOfInk='" + colorOfInk + '\'' +
                ", disposable=" + disposable +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (color != null ? !color.equals(pen.color) : pen.color != null) return false;
        if (nameProduction != null ? !nameProduction.equals(pen.nameProduction) : pen.nameProduction != null)
            return false;
        if (colorOfInk != null ? !colorOfInk.equals(pen.colorOfInk) : pen.colorOfInk != null) return false;
        return disposable != null ? disposable.equals(pen.disposable) : pen.disposable == null;

    }

    @Override
    public int hashCode() {
        int result = color != null ? color.hashCode() : 0;
        result = 31 * result + (nameProduction != null ? nameProduction.hashCode() : 0);
        result = 31 * result + (colorOfInk != null ? colorOfInk.hashCode() : 0);
        result = 31 * result + (disposable != null ? disposable.hashCode() : 0);
        return result;
    }
}
