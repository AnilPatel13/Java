package com.whygo.app.repo;

import com.whygo.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop lap) {
        System.out.println("saved");
    }
}
