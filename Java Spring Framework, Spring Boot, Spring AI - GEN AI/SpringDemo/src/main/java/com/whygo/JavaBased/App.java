package com.whygo.JavaBased;

import com.whygo.JavaBased.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Customer cust = context.getBean("customer", Customer.class);
        System.out.println(cust.getAge());
        cust.getCustomer();

//        Desktop desk = context.getBean("desktop", Desktop.class);
//        desk.getLaptop();
//
//        Desktop desk1 = context.getBean("desktop", Desktop.class);
//        desk1.getLaptop();

    }
}
