package com.example.fhw_springboot.Entity;


import java.math.BigDecimal;

public class MarginAmountEntity extends BaseEntity{

    private static final long serialVersionUID = 1286824152993055173L;

    private Integer popId;
    private Integer cooperativeMode;
    private Integer chargeType;
    private BigDecimal recNeedAmount;  //应收
    private Long ruleId;

    public Integer getCooperativeMode() {
        return cooperativeMode;
    }

    public void setCooperativeMode(Integer cooperativeMode) {
        this.cooperativeMode = cooperativeMode;
    }

    public Integer getPopId() {
        return popId;
    }
    public void setPopId(Integer popId) {
        this.popId = popId;
    }
    public Integer getChargeType() {
        return chargeType;
    }
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }
    public BigDecimal getRecNeedAmount() {
        return recNeedAmount;
    }
    public void setRecNeedAmount(BigDecimal recNeedAmount) {
        this.recNeedAmount = recNeedAmount;
    }
    public Long getRuleId() {
        return ruleId;
    }
    public void setRuleId(Long ruleId) {
        this.ruleId = ruleId;
    }

}

