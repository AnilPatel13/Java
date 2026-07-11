package com.whygo.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Embeddables {
    public static void main(String[] args) {

        CustomerAddress c2 = new CustomerAddress();
        c2.setStreet("123 Main St");
        c2.setCity("Anytown");
        c2.setState("CA");
        c2.setZipCode("12345");
        c2.setCountry("USA");

        Customer c1 = new Customer();
        c1.setId(1);
        c1.setName("John");
        c1.setEmail("john@gmail.com");
        c1.setPhone("1234567890");
        c1.setAddress(c2);




        SessionFactory sf = new Configuration().addAnnotatedClass(Customer.class).configure().buildSessionFactory(); //cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(c1);
        tx.commit();

        Customer c3 = session.find(Customer.class, 1);
        System.out.println(c3);
        session.close();
        sf.close();

//        System.out.println(c1);


    }
}
