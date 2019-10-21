package com.basics.in.java.blogspot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

        String[] BeanNames = applicationContext.getBeanFactory().getBeanDefinitionNames();

        for (String beanName : BeanNames) {
            System.out.println("\n Bean aname:" + beanName);
        }

    }
}