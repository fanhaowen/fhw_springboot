package com.example.fhw_springboot.Service;

//饿汉模式
public class Singleton {
    private final Object obj = new Object();
    public Object obj() {
        return this.obj;
    }


}
