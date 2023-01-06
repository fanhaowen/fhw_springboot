package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class popSettleEntity {
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(BigDecimal totalMoney) {
        this.totalMoney = totalMoney;
    }

    public BigDecimal getNonTaxMoney() {
        return nonTaxMoney;
    }

    public void setNonTaxMoney(BigDecimal nonTaxMoney) {
        this.nonTaxMoney = nonTaxMoney;
    }

    public BigDecimal getTaxMoney() {
        return taxMoney;
    }

    public void setTaxMoney(BigDecimal taxMoney) {
        this.taxMoney = taxMoney;
    }

    public Long getPopId() {
        return popId;
    }

    public void setPopId(Long popId) {
        this.popId = popId;
    }

    private String id;
    private BigDecimal totalMoney;
    private BigDecimal nonTaxMoney;
    private BigDecimal taxMoney;
    private Long popId;

    public String getFinalBillId() {
        return finalBillId;
    }

    public void setFinalBillId(String finalBillId) {
        this.finalBillId = finalBillId;
    }

    public String getSettleId() {
        return settleId;
    }

    public void setSettleId(String settleId) {
        this.settleId = settleId;
    }

    private String finalBillId;
    private String settleId;
}
