package com.whygo.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setRollNo(5);
        s1.setsName("John");
        s1.setsAge(20);

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(com.whygo.simple.Student.class);
//        cfg.configure();
        SessionFactory sf = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory(); //cfg.buildSessionFactory();
        Session session = sf.openSession();

        Transaction t = session.beginTransaction();
        session.persist(s1);
        t.commit();
        session.close();
        sf.close();

        System.out.println(s1);

    }
}