package com.levelup.lesson1.task2;

class Entry2 {
    public static void main(String[] args) {
        int n = 1;
        double An, e = 0.001;
        do {
            An = 1 / (((double)n + 1) * ((double) n + 1));
            System.out.println("При n = " + n + " An = " + An);
            n++;
        } while (An > e);
        System.out.println("Наименьший номер при котором выполняеться условие = " + (n - 2));
    }
}
