package com.example.fhw_springboot.Annotation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface IsNotNull {
    boolean value() default false;
}
