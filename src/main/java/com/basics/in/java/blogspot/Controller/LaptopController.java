package com.basics.in.java.blogspot.Controller;

import com.basics.in.java.blogspot.Service.LaptopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
public class LaptopController {

    private LaptopService laptopService;
    @Autowired
    public void setLaptopService(LaptopService laptopService) {

        this.laptopService = laptopService;

    }

    public static final Logger logger = LoggerFactory.getLogger(LaptopController.class);

    @RequestMapping("/")
    public String index() {
        laptopService.printLaptopName("laptopname");
        return "index.jsp";
    }

}