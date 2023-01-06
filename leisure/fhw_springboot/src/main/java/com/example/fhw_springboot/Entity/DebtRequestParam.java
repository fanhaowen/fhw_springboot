package com.example.fhw_springboot.Entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class DebtRequestParam extends PageDto implements Serializable {

    private static final long serialVersionUID = 5335161690920887303L;

    /**
     * 主键Id
     */
    private Long id;
    private List<Long> idList;

    /**
     * 供应商id
     */
    private Integer popId;
    private Integer cooperativeMode;

    /**
     * 欠款金额
     */
    private BigDecimal amount;

    /**
     * 城市Id
     */
    private Integer cityId;

    /**
     * 创建人id
     */
    private Long cuserId;

    /**
     * 创建人名称
     */
    private String cuserName;
    /**
     * 修改人id
     */
    private Long uuserId;

    /**
     * 修改人名称
     */
    private String uuserName;

    /**
     * 收款账户
     */
    private String rec_bank_account_code;

    /**
     * 收款账户名称
     */
    private String rec_bank_account_name;

    /**
     * 收款账户银行账户
     */
    private String rec_bank_no;

    /**
     * 收款账户银行名称
     */
    private String rec_bank_branch;

    /**
     * 收款开户行支行名称
     */
    private String rec_branch_bank_account_name;

    /**
     * 收款开户行支行行号
     */
    private String rec_branch_bank_account_code;

    /**
     * 账号ID
     */
    private Integer f_fi_bank_account;

    /**
     * 付款账户
     */
    private String bank_account_code;

    /**
     * 付款账户名称
     */
    private String bank_account_name;

    /**
     * 付款账户行号
     */
    private String bank_account_bank_no;

    /**
     * 付款账户分行
     */
    private String bank_account_bank_branch;

    /**
     * 付款开户行支行名称
     */
    private String branch_bank_account_name;

    /**
     * 付款开户行支行行号
     */
    private String branch_bank_account_code;

    /**
     * 收款金额
     */
    private BigDecimal rec_amount;

    /**
     * 最新欠款
     */
    private BigDecimal new_amount;

    private List<Long> popIdGroup;

    /**
     * 收款日期
     */
    private Integer recDate;
    /**
     * 冻结中数据
     * */
    private BigDecimal freezingAmount;
    /**
     * NoLimitAmount=1： debt表的amount查询全量数据
     * NoLimitAmount=0 || NoLimitAmount=null： debt表的amount>0查询数据【因为得兼容老pop的数据，所以需要判断NoLimitAmount=null】
     * NoLimitAmount =2:只查amount=0的数据
     * */
    private Integer noLimitAmount;
    /**
     * 查询有业务的欠款数据
     * */
    private Integer validDebt;

    public Integer getValidDebt() {
        return validDebt;
    }

    public void setValidDebt(Integer validDebt) {
        this.validDebt = validDebt;
    }

    public Integer getNoLimitAmount() {
        return noLimitAmount;
    }

    public void setNoLimitAmount(Integer noLimitAmount) {
        this.noLimitAmount = noLimitAmount;
    }

    public List<Long> getIdList() {
        return idList;
    }

    public void setIdList(List<Long> idList) {
        this.idList = idList;
    }

    public Integer getCooperativeMode() {
        return cooperativeMode;
    }

    public void setCooperativeMode(Integer cooperativeMode) {
        this.cooperativeMode = cooperativeMode;
    }

    public BigDecimal getFreezingAmount() {
        return freezingAmount;
    }

    public void setFreezingAmount(BigDecimal freezingAmount) {
        this.freezingAmount = freezingAmount;
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

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Long getCuserId() {
        return cuserId;
    }

    public void setCuserId(Long cuserId) {
        this.cuserId = cuserId;
    }

    public String getCuserName() {
        return cuserName;
    }

    public void setCuserName(String cuserName) {
        this.cuserName = cuserName;
    }

    public Long getUuserId() {
        return uuserId;
    }

    public void setUuserId(Long uuserId) {
        this.uuserId = uuserId;
    }

    public String getUuserName() {
        return uuserName;
    }

    public void setUuserName(String uuserName) {
        this.uuserName = uuserName;
    }

    public String getRec_bank_account_code() {
        return rec_bank_account_code;
    }

    public void setRec_bank_account_code(String rec_bank_account_code) {
        this.rec_bank_account_code = rec_bank_account_code;
    }

    public String getRec_bank_account_name() {
        return rec_bank_account_name;
    }

    public void setRec_bank_account_name(String rec_bank_account_name) {
        this.rec_bank_account_name = rec_bank_account_name;
    }

    public String getRec_bank_no() {
        return rec_bank_no;
    }

    public void setRec_bank_no(String rec_bank_no) {
        this.rec_bank_no = rec_bank_no;
    }

    public String getRec_bank_branch() {
        return rec_bank_branch;
    }

    public void setRec_bank_branch(String rec_bank_branch) {
        this.rec_bank_branch = rec_bank_branch;
    }

    public Integer getF_fi_bank_account() {
        return f_fi_bank_account;
    }

    public void setF_fi_bank_account(Integer f_fi_bank_account) {
        this.f_fi_bank_account = f_fi_bank_account;
    }

    public String getBank_account_code() {
        return bank_account_code;
    }

    public void setBank_account_code(String bank_account_code) {
        this.bank_account_code = bank_account_code;
    }

    public String getBank_account_name() {
        return bank_account_name;
    }

    public void setBank_account_name(String bank_account_name) {
        this.bank_account_name = bank_account_name;
    }

    public String getBank_account_bank_no() {
        return bank_account_bank_no;
    }

    public void setBank_account_bank_no(String bank_account_bank_no) {
        this.bank_account_bank_no = bank_account_bank_no;
    }

    public String getBank_account_bank_branch() {
        return bank_account_bank_branch;
    }

    public void setBank_account_bank_branch(String bank_account_bank_branch) {
        this.bank_account_bank_branch = bank_account_bank_branch;
    }

    public BigDecimal getRec_amount() {
        return rec_amount;
    }

    public void setRec_amount(BigDecimal rec_amount) {
        this.rec_amount = rec_amount;
    }

    public BigDecimal getNew_amount() {
        return new_amount;
    }

    public void setNew_amount(BigDecimal new_amount) {
        this.new_amount = new_amount;
    }

    public String getBranch_bank_account_code() {
        return branch_bank_account_code;
    }

    public void setBranch_bank_account_code(String branch_bank_account_code) {
        this.branch_bank_account_code = branch_bank_account_code;
    }

    public String getRec_branch_bank_account_name() {
        return rec_branch_bank_account_name;
    }

    public void setRec_branch_bank_account_name(String rec_branch_bank_account_name) {
        this.rec_branch_bank_account_name = rec_branch_bank_account_name;
    }

    public String getRec_branch_bank_account_code() {
        return rec_branch_bank_account_code;
    }

    public void setRec_branch_bank_account_code(String rec_branch_bank_account_code) {
        this.rec_branch_bank_account_code = rec_branch_bank_account_code;
    }

    public String getBranch_bank_account_name() {
        return branch_bank_account_name;
    }

    public void setBranch_bank_account_name(String branch_bank_account_name) {
        this.branch_bank_account_name = branch_bank_account_name;
    }

    public List<Long> getPopIdGroup() {
        return popIdGroup;
    }

    public void setPopIdGroup(List<Long> popIdGroup) {
        this.popIdGroup = popIdGroup;
    }

    public Integer getRecDate() {
        return recDate;
    }

    public void setRecDate(Integer recDate) {
        this.recDate = recDate;
    }
}
