package com.example.fhw_springboot.Annotation;


import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface MyGetter {
}
