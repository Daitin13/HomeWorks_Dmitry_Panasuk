package com.levelup.lesson1.task1;

class Entry1 {
    public static void main(String[] args) {
        Input input = new Input();
        Calc calc = new Calc();
        input.scun();

        switch (input.getStr()) {//что то не так
            case '+':
                calc.plus(input.getA(), input.getB());
                System.out.println(calc.res);
                break;
            case '-':
                calc.minus(input.getA(), input.getB());
                System.out.println(calc.res);
                break;
            case '*':
                calc.ymnoj(input.getA(), input.getB());
                System.out.println(calc.res);
                break;
            case '/':
                calc.delen(input.getA(), input.getB());
                System.out.println(calc.res);
                break;
            case '^':
                calc.pow(input.getA(), input.getB());
                System.out.println(calc.res);
                break;
        }

    }
}

