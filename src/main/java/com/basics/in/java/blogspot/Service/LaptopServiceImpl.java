package com.basics.in.java.blogspot.Service;


import org.springframework.stereotype.Component;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
class LaptopServiceImpl implements LaptopService {

    public final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void printLaptopName(String laptopname) {
        logger.info("The laptop name is: {}", laptopname);

    }

}