package com.whygo.JavaBased;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("desktop")
@Primary
@Scope("prototype")
public class Desktop implements Computer {

    public Desktop() {
        System.out.println("Desktop Constructor");
    }

    @Override
    public void getLaptop() {
        System.out.println("Desktop");
    }
}
