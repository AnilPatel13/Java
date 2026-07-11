package com.whygo.JavaBased.config;

import com.whygo.JavaBased.Computer;
import com.whygo.JavaBased.Customer;
import com.whygo.JavaBased.Desktop;
import com.whygo.JavaBased.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.whygo.JavaBased")
public class AppConfig {
//    @Bean
//    public Customer customer( @Autowired Computer com) { //@Qualifier("laptop")
//        Customer c = new Customer();
//        c.setAge(20);
//        c.setCom(com);
//        return c;
//    }
//
//
////    @Bean(name = "com2")
//    @Bean
////    @Scope("prototype")
//    public Desktop desktop() {
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//    public Laptop laptop() {
//        return new Laptop();
//    }

}
