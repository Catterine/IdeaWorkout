package com.infoshareacademy;

public class Main {

    public static void Sortowanie(int[] wejscie) {
        for (int i = wejscie.length -1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (wejscie[j] > wejscie[j+1]) {
                    int x = wejscie[j];
                    wejscie[j] = wejscie[j+1];
                    wejscie[j+1] = x;
                }

            }
        }
    }

    public static void pokazTablice(int[] wejscie) {
        for(int x : wejscie) System.out.print (x + " ");
        System.out.println ();
    }

    public static void main (String[] args) {
        int[] tablica = {2,3,1,5,4,9,8};
        Sortowanie(tablica);
        pokazTablice(tablica);
    } }



//
//    rzeczytaj jak działa algorytm sortowania bąbelkowego (bubble sort)
//
//    Stwórz metodę, które wykonuje sortowanie bąbelkowe na zadanej tablicy (int[])
//
//np. [3,6,5,2] → [2,3,5,6]
//
//        Wyświetl zawartość tablicy podczas sortowanie (np. co każdą iterację)
//
