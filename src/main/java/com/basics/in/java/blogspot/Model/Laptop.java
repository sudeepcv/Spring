package com.basics.in.java.blogspot.Model;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("\nLaptop [id=%s, name=%s, processor=%s, ram=%s]", id, name, processor, ram);
    }

}