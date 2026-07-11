package com.whygo.SetterInjector;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer cust = context.getBean("customer1", Customer.class);
//        cust.setAge(25);
        System.out.println(cust.getAge());
        cust.getCustomer();

//        Computer com = context.getBean(Computer.class);
//        com.getLaptop();
//
//        Desktop desk = context.getBean(Desktop.class);
//        desk.getLaptop();
    }
}
