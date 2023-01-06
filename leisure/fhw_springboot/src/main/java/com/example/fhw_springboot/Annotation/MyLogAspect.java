package com.example.fhw_springboot.Annotation;

import com.alibaba.fastjson.JSONObject;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.*;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Objects;

@Component
@Aspect
public class MyLogAspect {
    private  static final Logger logger = LoggerFactory.getLogger(MyLogAspect.class);
    @Pointcut("@annotation(com.example.fhw_springboot.Annotation.My1stAnnotation)")
    private void myValid() {}

    @Before("myValid()")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Signature signature1 = joinPoint.getSignature();
        System.out.println(signature1.getName());
        My1stAnnotation my1stAnnotation = signature.getMethod().getAnnotation(My1stAnnotation.class);
        logger.info("[{} : start.....]", signature.getName());
        logger.info(signature.getDeclaringTypeName());
        logger.info(String.valueOf(signature.getDeclaringType()));
        logger.info("【目标对象方法被调用时候产生的日志，记录到日志表中】：{}", my1stAnnotation.desc());
        Field[] field = signature.getClass().getDeclaredFields();
        for (int i = 0; i < field.length; i++) {
            // 权限修饰符
            int mo = field[i].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = field[i].getType();
            System.out.println("这个:"+priv + " " + type.getName() + " " + field[i].getName() + ";");
        }

    }
    @AfterReturning(pointcut = "myValid()", returning = "keys")
    public void after(JoinPoint joinPoint, Object keys) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        My1stAnnotation my1stAnnotation = signature.getMethod().getAnnotation(My1stAnnotation.class);
        if (!Objects.isNull(keys)) {
            System.out.println(JSONObject.toJSONString(keys));
        }
    }

}
