package com.whygo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Customer cust = (Customer)context.getBean("customer");
        cust.age = 25;
        System.out.println(cust.age);
//        cust.getCustomer();

        Customer cust1 = (Customer)context.getBean("customer");
        System.out.println(cust1.age);
//        cust1.getCustomer();
    }
}
