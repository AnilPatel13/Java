package com.whygo.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {
    public static void main(String[] args) {

        Student s2 = null;

        SessionFactory sf = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory(); //cfg.buildSessionFactory();
        Session session = sf.openSession();

        s2 = session.find(Student.class, 5);

        session.close();
        sf.close();
        System.out.println(s2);

    }
}
