package com.basics.in.java.blogspot;

import com.basics.in.java.blogspot.Service.LaptopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application implements CommandLineRunner {


    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);


    }

	@Override
	public void run(String... args) throws Exception {

	}
}