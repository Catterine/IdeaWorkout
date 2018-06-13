package com.infoshareacademy;

public class Calculator {

    public static int sum(int a, int b) {
        int s = a + b;
        System.out.print(s);
        return s;
    }
    public int subtract(int a, int b) {
//        public static jest statyczna
        int s = a - b;
        System.out.print(s);
//        this.sum();
        return s; /*string -> tekst ; int -> parametr*/
    }
}
