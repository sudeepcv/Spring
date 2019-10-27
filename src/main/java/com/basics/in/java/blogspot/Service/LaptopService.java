package com.basics.in.java.blogspot.Service;

import java.util.List;

import com.basics.in.java.blogspot.Model.Laptop;

public interface LaptopService {

    void printLaptopName(String laptopname);

    List<Laptop> findAll();

    Laptop findById(Long id);

    int deleteById(Long id);

    int insert(Laptop laptop);

    int update(Laptop laptop);


}