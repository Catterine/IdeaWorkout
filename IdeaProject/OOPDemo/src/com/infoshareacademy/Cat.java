package com.infoshareacademy;

public class Cat extends Animal {
    public boolean hungry;


    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

//    @override
    public String getName() {
        System.out.println("getName z Cat");
        return super.getName();
    }
}

