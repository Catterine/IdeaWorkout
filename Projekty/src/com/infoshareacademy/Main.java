package com.infoshareacademy;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {

          Scanner scanner = new Scanner(System.in);
          System.out.println("Podaj nr operacji");

          int selectedOption;
          selectedOption = scanner.nextInt();
          System.out.println("wybrana opcdja : " + selectedOption);

          switch (selectedOption) {
               case 1:
                    Operation.PLUS(3, 4);
                    break; }

               switch (selectedOption) {
                    case 2:
                         Operation.MINUS(5, 6);
                         break;
               }
                    switch (selectedOption) {
                         case 3:
                              Operation.MULTIPLY(3, 4);
                              break;
                    }
                         switch (selectedOption) {
                              case 4:
                                   Operation.DIVIDE(3, 4);
                                   break;
                         }
                              switch (selectedOption) {
                                   case 5:
                                        Trzy.trio(1, 2, 4);
                                        break;

                              }
                         }
                    }




