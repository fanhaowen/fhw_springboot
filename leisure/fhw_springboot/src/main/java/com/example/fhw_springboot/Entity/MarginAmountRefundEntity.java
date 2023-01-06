package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class MarginAmountRefundEntity {
    private Integer popId;
    private Integer refundTime; //退款时间
    private Integer refundType; //退款类型
    private Integer expectRefundTime;  //预计退款时间
    private BigDecimal amount;  //收款金额
    private Integer refundDelayDay; //退款推迟天数,最大90
    private String reason;
    private String recAccountCode;   //收款账号
    private String recAccountName;   //收款户名
    private String recBankName;   //收款银行支行名
    private String recBankBranch;   //收款开户行行号
    private String payAccountCode;   //付款帐号
    private String payAccountName;   //付款户名
    private String payBankName;   //付款银行支行名
    private String payBankBranch;   //付款开户行行号
    private String recBankNo; //开户行号
    private String payBankNo; //开户行号
    private String cUser;   //创建人
    private String approveUser;   //审批人
    private Integer status; //状态
    private Integer cityId;
    private BigDecimal marginBalance; //保证金余额
    //账单号
    private Long billId;
    //当保证金可以抵扣欠款：欠款冻结表主键id
    private Long debtFreezeId;
    //创建时间
    private Long createTime;
    //审核时间
    private Long approveTime;
    //通知财务时间
    private Long accountDate;
    private String financeReason;   //财务原因

    public Integer getPopId() {
        return popId;
    }

    public void setPopId(Integer popId) {
        this.popId = popId;
    }

    public Integer getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
    }

    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Integer getExpectRefundTime() {
        return expectRefundTime;
    }

    public void setExpectRefundTime(Integer expectRefundTime) {
        this.expectRefundTime = expectRefundTime;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Integer getRefundDelayDay() {
        return refundDelayDay;
    }

    public void setRefundDelayDay(Integer refundDelayDay) {
        this.refundDelayDay = refundDelayDay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRecAccountCode() {
        return recAccountCode;
    }

    public void setRecAccountCode(String recAccountCode) {
        this.recAccountCode = recAccountCode;
    }

    public String getRecAccountName() {
        return recAccountName;
    }

    public void setRecAccountName(String recAccountName) {
        this.recAccountName = recAccountName;
    }

    public String getRecBankName() {
        return recBankName;
    }

    public void setRecBankName(String recBankName) {
        this.recBankName = recBankName;
    }

    public String getRecBankBranch() {
        return recBankBranch;
    }

    public void setRecBankBranch(String recBankBranch) {
        this.recBankBranch = recBankBranch;
    }

    public String getPayAccountCode() {
        return payAccountCode;
    }

    public void setPayAccountCode(String payAccountCode) {
        this.payAccountCode = payAccountCode;
    }

    public String getPayAccountName() {
        return payAccountName;
    }

    public void setPayAccountName(String payAccountName) {
        this.payAccountName = payAccountName;
    }

    public String getPayBankName() {
        return payBankName;
    }

    public void setPayBankName(String payBankName) {
        this.payBankName = payBankName;
    }

    public String getPayBankBranch() {
        return payBankBranch;
    }

    public void setPayBankBranch(String payBankBranch) {
        this.payBankBranch = payBankBranch;
    }

    public String getRecBankNo() {
        return recBankNo;
    }

    public void setRecBankNo(String recBankNo) {
        this.recBankNo = recBankNo;
    }

    public String getPayBankNo() {
        return payBankNo;
    }

    public void setPayBankNo(String payBankNo) {
        this.payBankNo = payBankNo;
    }

    public String getcUser() {
        return cUser;
    }

    public void setcUser(String cUser) {
        this.cUser = cUser;
    }

    public String getApproveUser() {
        return approveUser;
    }

    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public BigDecimal getMarginBalance() {
        return marginBalance;
    }

    public void setMarginBalance(BigDecimal marginBalance) {
        this.marginBalance = marginBalance;
    }

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
    }

    public Long getDebtFreezeId() {
        return debtFreezeId;
    }

    public void setDebtFreezeId(Long debtFreezeId) {
        this.debtFreezeId = debtFreezeId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Long approveTime) {
        this.approveTime = approveTime;
    }

    public Long getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Long accountDate) {
        this.accountDate = accountDate;
    }

    public String getFinanceReason() {
        return financeReason;
    }

    public void setFinanceReason(String financeReason) {
        this.financeReason = financeReason;
    }
}
