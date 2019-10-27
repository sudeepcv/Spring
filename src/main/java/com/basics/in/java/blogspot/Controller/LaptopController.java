package com.basics.in.java.blogspot.Controller;

import java.util.List;

import com.basics.in.java.blogspot.Model.Laptop;
import com.basics.in.java.blogspot.Service.LaptopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String index(Model model) {
        laptopService.printLaptopName("laptopname");
        List<Laptop> laptops = laptopService.findAll();
        model.addAttribute("laptops", laptops);

        Laptop laptop = laptopService.findById(10001l);
        model.addAttribute("laptop", laptop);

        laptopService.deleteById(10002l);

        List<Laptop> updatedLaptop = laptopService.findAll();
        model.addAttribute("updatedLaptop", updatedLaptop);

        Laptop newLaptop = new Laptop();
        newLaptop.setName("apple");
        newLaptop.setProcessor("intel");
        newLaptop.setRam("8gb");
        laptopService.insert(newLaptop);

        List<Laptop> afterInsertLaptops = laptopService.findAll();
        model.addAttribute("afterInsertLaptops", afterInsertLaptops);

        newLaptop.setName("apple mac book air");
        laptopService.update(newLaptop);

        List<Laptop> afterUpdateLaptops = laptopService.findAll();
        model.addAttribute("afterUpdateLaptops", afterUpdateLaptops);

        return "index.jsp";
    }

}