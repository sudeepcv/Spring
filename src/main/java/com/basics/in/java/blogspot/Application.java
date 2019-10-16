package com.basics.in.java.blogspot;


import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Application {
//    private static final Logger logger = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
         ConfigurableApplicationContext applicationContext = SpringApplication.run(Application.class, args);

         String[] BeanNames = applicationContext.getBeanFactory().getBeanDefinitionNames();

         for(String beanName:BeanNames){
             if(beanName.equals("laptop"))
             System.out.println("\n Bean aname:"+beanName);
         }



}
}