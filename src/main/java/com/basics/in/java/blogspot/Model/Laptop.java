package com.basics.in.java.blogspot.Model;

import org.springframework.stereotype.Component;


@Component
class Laptop {

    private String name;
    private String processor;
    private String ram;

    public String getName() {
        return name;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setName(String name) {
        this.name = name;
    }
}