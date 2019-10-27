package com.basics.in.java.blogspot.Service;

import java.util.List;

import com.basics.in.java.blogspot.Model.Laptop;

public interface LaptopService {

    void printLaptopName(String laptopname);

    List<Laptop> findAll();

    Laptop findById(Long id);

    void deleteById(Long id);

    Laptop insert(Laptop laptop);

    Laptop update(Laptop laptop);

}