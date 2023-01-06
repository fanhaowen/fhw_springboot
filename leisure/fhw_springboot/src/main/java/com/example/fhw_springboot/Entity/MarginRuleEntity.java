package com.example.fhw_springboot.Entity;


public class MarginRuleEntity {
    private Long id;
    private Integer ruleVer;
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

    public Integer getRuleVer() {
        return ruleVer;
    }

    public void setRuleVer(Integer ruleVer) {
        this.ruleVer = ruleVer;
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

