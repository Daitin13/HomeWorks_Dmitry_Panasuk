package com.levelup.lesson1.task1;

 class Calc {
     double res;

     double plus(double a, double b) {
         res = a + b;
         return res;
     }

     double minus(double a, double b) {
         res = a - b;
         return res;
     }

     double ymnoj(double a, double b) {
         res = a * b;
         return res;
     }

     double delen(double a, double b) {
         if (b == 0) {
             return 0;
         } else res = a / b;
         return res;
     }

     double pow(double a, double b) {
         res = Math.pow(a, b);
         return res;
     }

 }
