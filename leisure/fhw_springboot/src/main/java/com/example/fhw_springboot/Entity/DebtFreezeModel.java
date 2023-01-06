package com.example.fhw_springboot.Entity;

import com.example.fhw_springboot.Annotation.My1stAnnotation;

import java.math.BigDecimal;

public class DebtFreezeModel {
    private Long id;
    private Long popId;
    private BigDecimal amount;
    private Long bizId;

    private Integer status;
    private Long ct;
    private Long ut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPopId() {
        return popId;
    }

    public void setPopId(Long popId) {
        this.popId = popId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Long getBizId() {
        return bizId;
    }

    public void setBizId(Long bizId) {
        this.bizId = bizId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getCt() {
        return ct;
    }

    public void setCt(Long ct) {
        this.ct = ct;
    }

    public Long getUt() {
        return ut;
    }

    public void setUt(Long ut) {
        this.ut = ut;
    }
}
