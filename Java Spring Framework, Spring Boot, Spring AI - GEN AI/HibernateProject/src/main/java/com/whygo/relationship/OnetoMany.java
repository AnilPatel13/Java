package com.whygo.relationship;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;

public class OnetoMany {

    public static void main(String[] args) {

        Laptop l1 = new Laptop();
        l1.setId(1);
        l1.setName("Dell");
        l1.setBrand("Dell");
        l1.setPrice(50000);

        Laptop l2 = new Laptop();
        l2.setId(2);
        l2.setName("Dell");
        l2.setBrand("Dell");
        l2.setPrice(50000);

        Customer c = new Customer();
        c.setId(101);
        c.setName("John");
        c.setEmail("john@gmail.com");
        c.setPhone("1234567890");
        c.setLaptops(Arrays.asList(l1, l2));

        System.out.println(c);
        System.out.println(l1);
        System.out.println(l2);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(com.whygo.relationship.Customer.class)
                .addAnnotatedClass(com.whygo.relationship.Laptop.class)
                .configure().buildSessionFactory();

        Session s = sf.openSession();

        Transaction tx = s.beginTransaction();


        s.persist(l1);
        s.persist(l2);
        s.persist(c);

        Customer c3 = s.find(Customer.class, 101);
        System.out.println(c3);

        tx.commit();

        s.close();
        sf.close();
    }
}
