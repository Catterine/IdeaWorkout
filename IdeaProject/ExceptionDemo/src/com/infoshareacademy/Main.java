package com.infoshareacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        try{

        } catch (InputMismatchException e ) {

            System.out.println(value);
        } catch (Exception e) {
            System.out.println("Incorrect value");
        }
    }
}



