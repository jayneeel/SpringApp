package com.jayneel.SpringApp.service;

import com.jayneel.SpringApp.repo.LaptopRepository;
import com.jayneel.SpringApp.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop){
        laptopRepository.save(laptop);
    }

    public boolean isSuitableForCoding(Laptop laptop){
        return true;
    }
}
