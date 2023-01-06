package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class MarginConfigChangeLogEntity {
    private Long id;
    private Long popId;
    private Long ruleDetailId;
    private Long statInfoId;
    private BigDecimal configAmount;
    private BigDecimal gmvAmount;
    private String cityList;
    private Integer tradeDays;
    private Integer changeType;
    private String changeContent;
    private Long uUserId;
    private String uUserName;
    private Integer uT;
    private Integer cT;
    private Integer isDeleted;

    public BigDecimal getConfigAmount() {
        return configAmount;
    }

    public void setConfigAmount(BigDecimal configAmount) {
        this.configAmount = configAmount;
    }

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

    public Long getRuleDetailId() {
        return ruleDetailId;
    }

    public void setRuleDetailId(Long ruleDetailId) {
        this.ruleDetailId = ruleDetailId;
    }

    public Long getStatInfoId() {
        return statInfoId;
    }

    public void setStatInfoId(Long statInfoId) {
        this.statInfoId = statInfoId;
    }

    public BigDecimal getGmvAmount() {
        return gmvAmount;
    }

    public void setGmvAmount(BigDecimal gmvAmount) {
        this.gmvAmount = gmvAmount;
    }

    public String getCityList() {
        return cityList;
    }

    public void setCityList(String cityList) {
        this.cityList = cityList;
    }

    public Integer getTradeDays() {
        return tradeDays;
    }

    public void setTradeDays(Integer tradeDays) {
        this.tradeDays = tradeDays;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public String getChangeContent() {
        return changeContent;
    }

    public void setChangeContent(String changeContent) {
        this.changeContent = changeContent;
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

