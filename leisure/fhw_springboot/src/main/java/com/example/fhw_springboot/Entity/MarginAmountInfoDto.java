package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class MarginAmountInfoDto {

    private static final long serialVersionUID = -4520854904961194242L;

    public BigDecimal getRecingMoney() {
        return recingMoney;
    }

    public void setRecingMoney(BigDecimal recingMoney) {
        this.recingMoney = recingMoney;
    }

    public BigDecimal getRefundingMoney() {
        return refundingMoney;
    }

    public void setRefundingMoney(BigDecimal refundingMoney) {
        this.refundingMoney = refundingMoney;
    }

    public BigDecimal getRefundHadMoney() {
        return refundHadMoney;
    }

    private Long id;
    private Integer popId;
    private Integer chargeType;
    // 缺失保证金
    private BigDecimal recNeedAmount;
    /**
     * 每笔账单抵扣比例，百分百，11.11表示11.11%
     */
    private BigDecimal eachBillDeductProportion;
    //配置的应收保证金
    private BigDecimal configMoney;
    //已收保证金
    private BigDecimal recHadMoney;
    //正在收取的保证金
    private BigDecimal recingMoney;
    //正在退款的保证金
    private BigDecimal refundingMoney;
    //已经收取的保证金
    private BigDecimal refundHadMoney;

    public BigDecimal getConfigMoney() {
        return configMoney;
    }

    public void setConfigMoney(BigDecimal configMoney) {
        this.configMoney = configMoney;
    }

    public BigDecimal getRecHadMoney() {
        return recHadMoney;
    }

    public void setRecHadMoney(BigDecimal recHadMoney) {
        this.recHadMoney = recHadMoney;
    }

    public void setRefundHadMoney(BigDecimal refundHadMoney) {
        this.refundHadMoney = refundHadMoney;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public BigDecimal getEachBillDeductProportion() {
        return eachBillDeductProportion;
    }

    public void setEachBillDeductProportion(BigDecimal eachBillDeductProportion) {
        this.eachBillDeductProportion = eachBillDeductProportion;
    }
}
