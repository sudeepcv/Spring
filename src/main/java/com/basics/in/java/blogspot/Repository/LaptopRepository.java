package com.basics.in.java.blogspot.Repository;


import javax.transaction.Transactional;

import com.basics.in.java.blogspot.Model.Laptop;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface LaptopRepository extends JpaRepository<Laptop, Long>{


}