package com.example.fhw_springboot.manage.Impl;

import com.example.fhw_springboot.Entity.MarginConfigEntity;
import com.example.fhw_springboot.manage.Adapter;

public class AliPayAdapter implements Adapter {
    private final String merchantId;

    AliPayAdapter(String merchantId) {
        this.merchantId = merchantId;
    }

    @Override
    public void download() {
        String url = merchantId;
    }

    @Override
    public MarginConfigEntity format() {
        return null;
    }

    @Override
    public void uploadFile() {

    }
}
