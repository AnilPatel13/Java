package com.whygo.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOne {

    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        laptop.setId(1);
        laptop.setName("Dell");
        laptop.setBrand("Dell");
        laptop.setPrice(50000);

        Customer c = new Customer();
        c.setId(101);
        c.setName("John");
        c.setEmail("john@gmail.com");
        c.setPhone("1234567890");
//        c.setLaptop(laptop);

        System.out.println(c);
        System.out.println(laptop);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.whygo.relationship.Customer.class)
                .addAnnotatedClass(com.whygo.relationship.Laptop.class)
                .configure().buildSessionFactory();

        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();


        s.persist(laptop);
        s.persist(c);

        Customer c3 = s.find(Customer.class, 101);
        System.out.println(c3);

        tx.commit();

        s.close();
        sf.close();


    }
}
