package com.example.fhw_springboot.Annotation;

import com.example.fhw_springboot.Entity.MarginConfigEntity;
import com.example.fhw_springboot.Tools.MapTool;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Aspect
@Component
public class IsNotNullAspect {
    private MapTool map;
    @Pointcut("@annotation(com.example.fhw_springboot.Annotation.IsNotNull)")
    private void isNotNull() {}

    @Before("isNotNull()")
    public void before(JoinPoint joinPoint) {
        List<Object> args = Arrays.asList(joinPoint.getArgs());
        List<MarginConfigEntity> entities = map.mapList(args, MarginConfigEntity.class);
        entities.forEach(
                e -> {}
        );
    }
}
