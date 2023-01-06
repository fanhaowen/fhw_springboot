package com.example.fhw_springboot.Entity;


import com.alibaba.fastjson.JSONObject;
import com.example.fhw_springboot.Annotation.My1stAnnotation;
import com.example.fhw_springboot.Annotation.MyGetter;

import java.math.BigDecimal;

@MyGetter
@My1stAnnotation(desc = "")
public class MarginConfigEntity implements Cloneable{
    private Long id;
    private Long popId;
    private Integer receiveType;
    private Integer configType;
    private BigDecimal amount;
    private BigDecimal billRate;
    private Integer cooperativeMode;
    private Integer popType;
    private Integer businessModel;
    private Long uUserId;
    private String uUserName;
    private Integer uT;
    private Integer cT;
    private Integer isDeleted;

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

    public Integer getReceiveType() {
        return receiveType;
    }

    public void setReceiveType(Integer receiveType) {
        this.receiveType = receiveType;
    }

    public Integer getConfigType() {
        return configType;
    }

    public void setConfigType(Integer configType) {
        this.configType = configType;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getBillRate() {
        return billRate;
    }

    public void setBillRate(BigDecimal billRate) {
        this.billRate = billRate;
    }

    public Integer getCooperativeMode() {
        return cooperativeMode;
    }

    public void setCooperativeMode(Integer cooperativeMode) {
        this.cooperativeMode = cooperativeMode;
    }

    public Integer getPopType() {
        return popType;
    }

    public void setPopType(Integer popType) {
        this.popType = popType;
    }

    public Integer getBusinessModel() {
        return businessModel;
    }

    public void setBusinessModel(Integer businessModel) {
        this.businessModel = businessModel;
    }

    public Long getuUserId() {
        return uUserId;
    }

    public void setuUserId(Long uUserId) {
        this.uUserId = uUserId;
    }

    public String getuUserName() {
        return uUserName;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public Integer getuT() {
        return uT;
    }

    public void setuT(Integer uT) {
        this.uT = uT;
    }

    public Integer getcT() {
        return cT;
    }

    public void setcT(Integer cT) {
        this.cT = cT;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }

}

