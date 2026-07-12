package com.whygo.app;

import com.whygo.app.model.Customer;
import com.whygo.app.model.Laptop;
import com.whygo.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        System.out.println("Hello World");

        LaptopService service = context.getBean(LaptopService.class);

        Laptop laptop = context.getBean(Laptop.class);
        service.addLaptop(laptop);



//        Customer cust = context.getBean(Customer.class);
//        System.out.println("Age: " + cust.getAge());
//        cust.show();
//
//        Customer customer = context.getBean(Customer.class);
//        customer.show();


    }

}
