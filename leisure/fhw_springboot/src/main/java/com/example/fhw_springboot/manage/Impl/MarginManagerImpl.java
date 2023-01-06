package com.example.fhw_springboot.manage.Impl;

import com.example.fhw_springboot.manage.MarginManager;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MarginManagerImpl implements MarginManager {

    @Override
    public void returnList() {
        System.out.println("我是IMPL");

    }
}
