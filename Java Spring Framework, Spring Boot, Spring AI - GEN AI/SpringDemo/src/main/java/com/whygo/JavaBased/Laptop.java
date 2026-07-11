package com.whygo.JavaBased;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public Laptop() {
        System.out.println("Laptop Constructor");
    }

    @Override
    public void getLaptop() {
        System.out.println("Laptop");
    }
}
