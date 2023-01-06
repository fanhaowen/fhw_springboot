package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;
import java.util.List;

public class MarginAmountConfigEntity extends BaseEntity{

    private static final long serialVersionUID = 5869286225915648452L;


    /**
     * 供应商id
     */
    private Integer popId;
    /**
     * 保证金类型 是否收取保证金 1不收取，2银行转账收取，3单笔账单抵扣比例收取
     */
    private Integer marginAmountType;
    /**
     * 保证金金额
     */
    private BigDecimal marginAmount;
    /**
     * 每笔账单抵扣比例，百分百，11.11表示11.11%
     */
    private BigDecimal eachBillDeductProportion;

    /**
     * 创建人id
     */
    private Long cUserId;
    /**
     * 创建人名称
     */
    private String cUserName;
    /**
     * 状态：1-待审核，2-审核通过，3审核不通过
     */
    private Integer status;
    /**
     * 审批人id
     */
    private Long approveUserId;
    /**
     * 审批人名称
     */
    private String approveUser;

    private List<MarginAmountCitySummaryEntity> citySummaryEntities;

    public Integer getPopId() {
        return popId;
    }

    public void setPopId(Integer popId) {
        this.popId = popId;
    }

    public Integer getMarginAmountType() {
        return marginAmountType;
    }

    public void setMarginAmountType(Integer marginAmountType) {
        this.marginAmountType = marginAmountType;
    }

    public BigDecimal getMarginAmount() {
        return marginAmount;
    }

    public void setMarginAmount(BigDecimal marginAmount) {
        this.marginAmount = marginAmount;
    }

    public BigDecimal getEachBillDeductProportion() {
        return eachBillDeductProportion;
    }

    public void setEachBillDeductProportion(BigDecimal eachBillDeductProportion) {
        this.eachBillDeductProportion = eachBillDeductProportion;
    }

    public Long getcUserId() {
        return cUserId;
    }

    public void setcUserId(Long cUserId) {
        this.cUserId = cUserId;
    }

    public String getcUserName() {
        return cUserName;
    }

    public void setcUserName(String cUserName) {
        this.cUserName = cUserName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getApproveUserId() {
        return approveUserId;
    }

    public void setApproveUserId(Long approveUserId) {
        this.approveUserId = approveUserId;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    public List<MarginAmountCitySummaryEntity> getCitySummaryEntities() {
        return citySummaryEntities;
    }

    public void setCitySummaryEntities(List<MarginAmountCitySummaryEntity> citySummaryEntities) {
        this.citySummaryEntities = citySummaryEntities;
    }
}
