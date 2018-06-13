package com.infoshareacademy;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account(); //utworzenie obuktu w funkcji main//

        System.out.println(myAccount);

        String first = "macOS";
        String second = "mac";
        second += "OS";
        if (first.equals(second)) {
            System.out.println("Linux");
        }
//        myAccount.show(); //wywołanie metody show w myaccount po kropce//
//        myAccount .setBalance(50); //zmiana stanu konta korzystając z settera//
//        myAccount.show();

    }

}
