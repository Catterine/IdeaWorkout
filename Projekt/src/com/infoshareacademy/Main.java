package com.infoshareacademy;

import java.util.Scanner;

public class Main {

    private static String Hex;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę rzeczywistą");
        float f = in.nextFloat();

        int x=0b101;
        int y=0b110;
        int z=x+y;

        System.out.println(x + "+" + y + "=" + z);

        System.out.printf("%s+%s=%s%n", Integer.toHexString(z), Integer.toHexString(z), Integer.toHexString(z));
        Integer.parseInt(Hex, 16);
        Integer.decode("0x" + Hex);

        int n = (int) Long.parseLong("ffff8000", 16);

        System.out.printf("%s+%s=%s%n", Integer.toHexString(z), Integer.toHexString(z), Integer.toHexString(x));


        }
}


//pobierz z konsoli liczbę całkowitą w postaci dziesiętnej
//
//Wypisz podaną liczbę w postaci binarnej, tj. 5 = 101
//
//Wypisz podaną liczbę w postaci szesnastkowej, tj. 47 = 2F