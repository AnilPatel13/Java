package com.whygo.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ChangingTableColumnNames {
    public static void main(String[] args) {

        Device d1 = new Device();
        d1.setId(1);
        d1.setName("Laptop");
        d1.setBrand("Dell");
        d1.setPrice(50000);

        SessionFactory sf = new Configuration().addAnnotatedClass(Device.class).configure().buildSessionFactory(); //cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        System.out.println(d1);

        session.persist(d1);
        t.commit();
        session.close();
        sf.close();


    }
}
