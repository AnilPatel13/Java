package com.whygo.simple;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDeleteObject {
    public static void main(String[] args) {

//        update and insert
        SessionFactory sf = new Configuration().addAnnotatedClass(Student.class).configure().buildSessionFactory(); //cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction t = session.beginTransaction();

        Student S1 = new Student();
        S1.setRollNo(6);
        S1.setsName("Avinash");
        S1.setsAge(18);



        System.out.println(S1);

    // delete

        Student S2 = session.find(Student.class, 3);
        if (S2 != null) {
            session.remove(S2);
        } else {
            System.out.println("Student with rollNo=2 not found");
        }

        session.merge(S1);
        t.commit();
        session.close();
        sf.close();

    }
}
