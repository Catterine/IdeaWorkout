package com.infoshareacademy;

public class Account {

    private String numer;
    private String owner;
    private int balance;

        public Account() {
            this.balance = 1000000; //konstruktor//
            System.out.println("Balance = " + this.balance);
        }

            public void show() {
                System.out.println("===060618====");
                System.out.println("Current balance = " + this.balance); //wywołanie metody show//
;            }

    public String getNumer() {
        return numer;
    }

    public void setNumer(String numer) {
        this.numer = numer;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
