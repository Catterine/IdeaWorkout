package com.infoshareacademy;

import java.util.Scanner;

class Cal2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter two numbers:");
            int a = input.nextInt();
            int b = input.nextInt();

        }

        //Method goes here
        public static void pythagoraen(int x, int y) {
            int z = (int) Math.pow(x, y);

            System.out.println(z);

        }
    }