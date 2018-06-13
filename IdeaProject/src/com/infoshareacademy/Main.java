package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        int[] tab = createArray(10);

        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.println(tab[1]);
        }
    }


    public static int[] createArray(int size) {
        int[] array = new int[size];

        int i = 0;
        int j = 0;
        while (i < size) {
            j = j + 2;
            array[i] = j;
            i++;
        }

        return array;
    }
}