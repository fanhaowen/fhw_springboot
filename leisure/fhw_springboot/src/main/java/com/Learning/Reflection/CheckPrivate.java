package com.Learning.Reflection;

import com.alibaba.fastjson.JSONObject;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.Arrays;

public class CheckPrivate {
    public static Object checkPrivate() throws InstantiationException, IllegalAccessException {
        Class<?> klass = UnePrivateClass.class;
        Method[] methods = klass.getDeclaredMethods();
        UnePrivateClass obj = new UnePrivateClass();
        Arrays.stream(methods).forEach(e -> {
            System.out.println(e.getName());
            if (e.getName().equals("addAmountPrivate")) {

            }
        });
        System.out.println(obj.amount);
        UnePrivateClass c = (UnePrivateClass) klass.newInstance();
        return null;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        checkPrivate();
        JSONObject js = new JSONObject();
    }
}
