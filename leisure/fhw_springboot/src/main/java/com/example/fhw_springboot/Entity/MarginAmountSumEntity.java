package com.example.fhw_springboot.Entity;

import java.io.Serializable;
import java.math.BigDecimal;


public class MarginAmountSumEntity implements Serializable {

    private static final long serialVersionUID = -8967040290920653931L;
    private Long id;
    private Integer popId;
    private BigDecimal amount;
    private Integer status;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }


}
