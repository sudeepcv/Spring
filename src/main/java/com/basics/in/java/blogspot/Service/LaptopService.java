package com.basics.in.java.blogspot.Service;

import java.util.List;
import java.util.Optional;

import com.basics.in.java.blogspot.Model.Laptop;

public interface LaptopService {

    void printLaptopName(String laptopname);

    List<Laptop> findAll();

    Optional<Laptop>  findById(Long id);

    void deleteById(Long id);

    Laptop save(Laptop laptop);



}