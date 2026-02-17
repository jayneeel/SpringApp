package com.jayneel.SpringApp.repo;

import com.jayneel.SpringApp.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop laptop){
        System.out.println("Laptop saved..");
    }
}
