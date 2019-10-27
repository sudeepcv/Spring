package com.basics.in.java.blogspot.Repository;

import java.util.List;

import com.basics.in.java.blogspot.Model.Laptop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Laptop> findAll() {
        return jdbcTemplate.query("select * from laptop", new BeanPropertyRowMapper<Laptop>(Laptop.class));

    }

    public Laptop findById(Long id) {
        return jdbcTemplate.queryForObject("select * from laptop where id=?", new Object[] { id },
                new BeanPropertyRowMapper<Laptop>(Laptop.class));

    }

    public int deleteById(Long id) {
        return jdbcTemplate.update("delete from laptop where id=?", new Object[] { id });

    }

    public int insert(Laptop laptop) {
        return jdbcTemplate.update("INSERT INTO LAPTOP (ID, NAME, PROCESSOR,RAM )" + "VALUES(?,?,?,?)",
                new Object[] { laptop.getId(), laptop.getName(), laptop.getProcessor(), laptop.getRam() });

    }

    public int update(Laptop laptop) {
        return jdbcTemplate.update("update laptop set name=? ,processor=?, ram=?" + "where id=?",
                new Object[] { laptop.getName(), laptop.getProcessor(), laptop.getRam(), laptop.getId() });

    }

}