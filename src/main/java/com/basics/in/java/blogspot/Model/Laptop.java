package com.basics.in.java.blogspot.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name = "find_all_laptops", query = "select l from Laptop l")
public class Laptop {
    @Id
    @GeneratedValue
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