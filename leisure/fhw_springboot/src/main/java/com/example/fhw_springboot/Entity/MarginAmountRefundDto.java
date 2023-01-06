package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class MarginAmountRefundDto extends BaseDto{

    private static final long serialVersionUID = -1566604076442218410L;

    private Long id;
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
    private String cUser;   //创建人
    private String approveUser;   //审批人
    private String recBankNo; //开户行号
    private String payBankNo; //开户行号
    private Integer status; //状态
    private Long debtFreezeId; //欠款冻结表主键id

    public Integer getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Integer approveTime) {
        this.approveTime = approveTime;
    }

    public Integer getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Integer accountDate) {
        this.accountDate = accountDate;
    }
    public BigDecimal getDebtFreezeAmount() {
        return debtFreezeAmount;
    }

    public void setDebtFreezeAmount(BigDecimal debtFreezeAmount) {
        this.debtFreezeAmount = debtFreezeAmount;
    }

    public BigDecimal getActualAmount() {
        return actualAmount;
    }

    public void setActualAmount(BigDecimal actualAmount) {
        this.actualAmount = actualAmount;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    private Integer approveTime; //单据审核时间
    private Integer accountDate; //发送给财务的时间
    private String financeReason; //财务审核失败的原因
    private Long billId;
    private Integer ct;
    private Integer ut;
    private BigDecimal debtFreezeAmount;
    //抵扣欠款后，实际退保证金的金额
    private BigDecimal actualAmount;
    //创建时间
    private Long createTime;

    public Long getBillId() {
        return billId;
    }

    public void setBillId(Long billId) {
        this.billId = billId;
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

    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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
    public Integer getRefundTime() {
        return refundTime;
    }
    public void setRefundTime(Integer refundTime) {
        this.refundTime = refundTime;
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
    public Integer getExpectRefundTime() {
        return expectRefundTime;
    }
    public void setExpectRefundTime(Integer expectRefundTime) {
        this.expectRefundTime = expectRefundTime;
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
    public Integer getRefundType() {
        return refundType;
    }

    public void setRefundType(Integer refundType) {
        this.refundType = refundType;
    }

    public Long getDebtFreezeId() {
        return debtFreezeId;
    }

    public void setDebtFreezeId(Long debtFreezeId) {
        this.debtFreezeId = debtFreezeId;
    }

    public String getFinanceReason() {
        return financeReason;
    }

    public void setFinanceReason(String financeReason) {
        this.financeReason = financeReason;
    }


}
