package com.whygo.SetterInjector;

public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    @Override
    public void getLaptop() {
        System.out.println("Desktop");
    }
}
