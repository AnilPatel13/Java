package com.whygo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println("Hello World");

        Customer cust = context.getBean(Customer.class);
        System.out.println("Age: " + cust.getAge());
        cust.show();
//
//        Customer customer = context.getBean(Customer.class);
//        customer.show();


    }

}
