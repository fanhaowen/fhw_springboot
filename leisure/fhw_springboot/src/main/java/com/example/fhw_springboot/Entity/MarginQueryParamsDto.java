package com.example.fhw_springboot.Entity;


import java.util.List;

public class MarginQueryParamsDto extends PageDto{

    private static final long serialVersionUID = 8770769575032223347L;
    private Long id;
    private Integer popId;
    private Integer chargeType;
    private Integer status;
    private Long billId;
    private List<Long> popIdGroup;
    private Integer cooperativeMode;

    public Integer getCooperativeMode() {
        return cooperativeMode;
    }

    public void setCooperativeMode(Integer cooperativeMode) {
        this.cooperativeMode = cooperativeMode;
    }

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
    public Integer getChargeType() {
        return chargeType;
    }
    public void setChargeType(Integer chargeType) {
        this.chargeType = chargeType;
    }
    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public List<Long> getPopIdGroup() {
        return popIdGroup;
    }
    public void setPopIdGroup(List<Long> popIdGroup) {
        this.popIdGroup = popIdGroup;
    }

}

