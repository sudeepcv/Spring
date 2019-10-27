package com.basics.in.java.blogspot.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import com.basics.in.java.blogspot.Model.Laptop;
import com.basics.in.java.blogspot.Repository.LaptopRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
class LaptopServiceImpl implements LaptopService {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public void printLaptopName(String laptopname) {
        logger.info("The laptop name is: {}", laptopname);

    }

	@Override
	public List<Laptop> findAll() {
		return laptopRepository.findAll();
	}

	@Override
	public Optional<Laptop> findById(Long id) {
		return laptopRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		laptopRepository.deleteById(id);
	}

	@Override
	public Laptop save(Laptop laptop) {
		return laptopRepository.save(laptop);
	}



}