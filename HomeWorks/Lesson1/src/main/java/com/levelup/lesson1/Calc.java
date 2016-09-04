package com.levelup.lesson1;

public class Calc {
    public Calc() {
      this.input = new Input();
    }
    Input input;

    public Calc(Input input) {
        this.input = input;
    }

    private double result;

    public double calc() {
        switch (input.getStr()) {
            case "+":
                result = input.getA() + input.getB();
                break;
            case "-":
                result = input.getA() - input.getB();

                break;
            case "*":
                result = input.getA() * input.getB();

                break;
            case "/":
                if (input.getB() == 0) {
                    System.out.println("На ноль делить нельзя");
                    break;
                } else {
                    result = input.getA() / input.getB();
                    break;
                }
            case "^":
                result = Math.pow(input.getA(), input.getB());
                break;
            default:
                System.out.println("Не верный Знак!");
        }
        System.out.println("Результат операции = " + result);
        return result;
    }

    public static void main(String[] args) {
        Calc calc = new Calc();
        calc.calc();
    }
}


