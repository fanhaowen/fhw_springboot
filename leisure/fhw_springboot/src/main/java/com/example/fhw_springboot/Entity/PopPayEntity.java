package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class PopPayEntity {
    private String id;
    private String popId;
    private String billId;
    private Integer status;
    private BigDecimal money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPopId() {
        return popId;
    }

    public void setPopId(String popId) {
        this.popId = popId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }
}
