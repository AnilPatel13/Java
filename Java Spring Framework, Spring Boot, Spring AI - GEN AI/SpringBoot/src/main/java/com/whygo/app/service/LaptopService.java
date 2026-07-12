package com.whygo.app.service;

import com.whygo.app.repo.LaptopRepository;
import com.whygo.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
//        System.out.println("method called");
    }

    public boolean isGood(Laptop lap) {
        return true;
    }
}
