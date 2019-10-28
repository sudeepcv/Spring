package com.basics.in.java.blogspot.Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Before("com.basics.in.java.blogspot.Aspect.CommonJoinpointConfig.serviceLayerExecution()")
    public void before(JoinPoint joinpoint) {
        // Advice
        logger.info("Before jointpoint Intercepted mehtod call- {}", joinpoint);
    }

    @AfterReturning(value = "execution(* com.basics.in.java.blogspot.Service..*(..))", returning = "result")
    public void after(JoinPoint joinpoint, Object result) {
        // Advice
        // logger.info("{} returned with value -{}", joinpoint,result);
    }

    @AfterThrowing(value = "execution(* com.basics.in.java.blogspot.Service..*(..))", throwing = "exception")
    public void afterThrowing(JoinPoint joinpoint, Exception exception) {
        // Advice
        logger.info("{} returned with Exception -{}", joinpoint, exception);
    }

    @After(value = "execution(* com.basics.in.java.blogspot.Service..*(..))")
    public void afterThrowing(JoinPoint joinpoint) {
        // Advice
        logger.info("after execution of -{}", joinpoint);
    }

    // @Around(value = "execution(* com.basics.in.java.blogspot.Service..*(..))")
    // public void around(ProceedingJoinPoint joinpoint) throws Throwable {
    //     // Advice
    //     long startTime = System.currentTimeMillis();
    //     joinpoint.proceed();
    //     long timeTaken = System.currentTimeMillis() - startTime;
    //     logger.info("time taken by -{} is -{}", joinpoint, timeTaken);
    // }

}