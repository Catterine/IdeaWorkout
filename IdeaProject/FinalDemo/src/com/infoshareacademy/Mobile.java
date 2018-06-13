package com.infoshareacademy;

public final class Mobile extends Device {

    public void turnOn() {
//        this.turnOn(); <- wywołuje sama siebie
         System.out.println("Device:turn on");
    }

    public void turnOff() {
//        this.turnOff();
        System.out.println("Device: turn off");
    }


}
 //public final void  -> jeśli final mamy w metodzie to nie można
// jej nadpisać
//jezeli final jest w klasie -> nie mozna dziedziczyc po tej klasie