package com.whygo.Hql;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.concurrent.TimeUnit;

public class CaffeineCacheExample {
    public static void main(String[] args) {

        // Create Caffeine cache programmatically
        Cache<Integer, Laptop> cache = Caffeine.newBuilder()
                .maximumSize(100)
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build();

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Laptop.class)
                .configure().buildSessionFactory();

        Session s = sf.openSession();

        // First fetch - from database
        Laptop l1 = s.get(Laptop.class, 1);
        System.out.println("From Database: " + l1);
        cache.put(1, l1);

        s.close();

        // Second fetch - from cache
        Laptop cachedLaptop = cache.getIfPresent(1);
        if (cachedLaptop != null) {
            System.out.println("From Cache: " + cachedLaptop);
        }

        s = sf.openSession();

        // Third fetch - from database again (to show cache works independently)
        Laptop l2 = s.get(Laptop.class, 1);
        System.out.println("From Database again: " + l2);

        s.close();
        sf.close();

    }
}
