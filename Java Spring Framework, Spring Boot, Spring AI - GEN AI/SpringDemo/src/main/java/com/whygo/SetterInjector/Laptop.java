package com.whygo.SetterInjector;

public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    @Override
    public void getLaptop() {
        System.out.println("Laptop");
    }
}
