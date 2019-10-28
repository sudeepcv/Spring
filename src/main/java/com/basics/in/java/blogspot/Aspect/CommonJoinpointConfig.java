package com.basics.in.java.blogspot.Aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinpointConfig{
    @Pointcut("execution(* com.basics.in.java.blogspot.Service..*(..))")
    public void serviceLayerExecution(){}
}