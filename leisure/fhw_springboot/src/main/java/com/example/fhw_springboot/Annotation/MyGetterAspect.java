package com.example.fhw_springboot.Annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class MyGetterAspect {

    private  static final Logger logger = LoggerFactory.getLogger(MyLogAspect.class);

    @Pointcut("@annotation(com.example.fhw_springboot.Annotation.MyGetter)")
    private void getter(){}
    @Before("getter()")
    public void before(JoinPoint joinPoint) {
        Signature s = joinPoint.getSignature();
        logger.info(s.getDeclaringTypeName());
    }

}
