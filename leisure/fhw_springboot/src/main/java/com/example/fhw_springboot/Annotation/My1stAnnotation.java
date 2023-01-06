package com.example.fhw_springboot.Annotation;

import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface My1stAnnotation {
    String desc();
}
