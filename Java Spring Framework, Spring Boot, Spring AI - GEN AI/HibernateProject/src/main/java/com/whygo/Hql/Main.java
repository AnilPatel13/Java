package com.whygo.Hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Laptop l1 = new Laptop();
//        l1.setId(6);
//        l1.setName("MAC");
//        l1.setBrand("MAC");
//        l1.setPrice(50000);


//        System.out.println(l1);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure().buildSessionFactory();

//        Session s = sf.openSession();

//        Transaction tx = s.beginTransaction();


//        s.persist(l1);

//        System.out.println(c3);

//        tx.commit();

//        s.close();

        Session s1 = sf.openSession();

//        Laptop l2 = s1.find(Laptop.class, 6);
//        System.out.println(l2);

        // select * from laptop where id = 6;
        // from Laptop where id = 6;

//        Query q = s1.createQuery("from Laptop");
        String brand = "Dell";
//        Query q = s1.createQuery("from Laptop where brand like '%Dell%'", Laptop.class);
//        Query<Integer> q = s1.createQuery("select price from Laptop where brand like :brand", Integer.class);
//        q.setParameter("brand", brand);
//        List<Integer> laptops = q.getResultList();
//        laptops.forEach(System.out::println);

        Query q = s1.createQuery("select price, brand from Laptop where brand like :brand", Object[].class);
        q.setParameter("brand", brand);
        List<Object[]> laptops = q.getResultList();
        laptops.forEach(arr -> System.out.println(Arrays.toString(arr)));

        System.out.println(laptops.get(0)[0]+" "+laptops.get(0)[1]);
        System.out.println(laptops.get(1)[0]+" "+laptops.get(1)[1]);




        s1.close();

        sf.close();
    }
}
