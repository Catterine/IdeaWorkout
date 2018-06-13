package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        String myText = "   I     hate     snow     ";
        myText = myText.trim(); // usuwa spacje przed i po ....a....//
        myText = myText.replace("     ", " "); //zmiana fraz//
        myText = myText.replace("hate", "love");
        myText = myText.toUpperCase();
        System.out.println(myText);
    }
}
