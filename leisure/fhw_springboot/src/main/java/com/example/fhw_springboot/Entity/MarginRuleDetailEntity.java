package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class MarginRuleDetailEntity {
    private Long id;
    private Long ruleId;
    private Integer ruleVer;
    private BigDecimal maxAmount;
    private Integer ruleType;
    private BigDecimal configAmount;
    private Integer calculateDay;
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

    public Long getRuleId() {
        return ruleId;
    }

    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

    public Integer getRuleVer() {
        return ruleVer;
    }

    public void setRuleVer(Integer ruleVer) {
        this.ruleVer = ruleVer;
    }

    public BigDecimal getMaxAmount() {
        return maxAmount;
    }

    public void setMaxAmount(BigDecimal maxAmount) {
        this.maxAmount = maxAmount;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public BigDecimal getConfigAmount() {
        return configAmount;
    }

    public void setConfigAmount(BigDecimal configAmount) {
        this.configAmount = configAmount;
    }

    public Integer getCalculateDay() {
        return calculateDay;
    }

    public void setCalculateDay(Integer calculateDay) {
        this.calculateDay = calculateDay;
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
