package com.example.fhw_springboot.manage;

import com.example.fhw_springboot.Entity.MarginConfigEntity;

public class BaseAdapter implements Adapter{
    private final String merchantId;

    public BaseAdapter(String merchantId) {
        this.merchantId = merchantId;
    }

    @Override
    public void download() {

    }

    @Override
    public MarginConfigEntity format() {
        return null;
    }

    @Override
    public void uploadFile() {

    }
}
