package com.example.fhw_springboot.manage;

import com.example.fhw_springboot.Entity.MarginConfigEntity;

public interface Adapter {
    void download();
    MarginConfigEntity format();
    void uploadFile();

}
