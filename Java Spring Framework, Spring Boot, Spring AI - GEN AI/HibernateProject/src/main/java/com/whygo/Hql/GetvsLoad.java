package com.whygo.Hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetvsLoad {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure().buildSessionFactory();

        Session s = sf.openSession();

        Laptop l1 = s.get(Laptop.class, 1);
        System.out.println(l1);

        Laptop l2 = s.find(Laptop.class, 1);
        System.out.println(l2);

        s.close();
        sf.close();

    }
}
