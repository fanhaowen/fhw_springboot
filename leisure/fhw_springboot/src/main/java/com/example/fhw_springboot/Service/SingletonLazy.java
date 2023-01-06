package com.example.fhw_springboot.Service;

import org.springframework.stereotype.Component;

public class SingletonLazy {

    private static volatile Object obj;
    public static Object getObj() {
        if (obj == null) {
            synchronized (SingletonLazy.class) {
                if (obj == null) {
                    obj = new Object();
                }
            }
        }
        return obj;
    }

    static {
        System.out.println("我是static代码块");
    }


}

