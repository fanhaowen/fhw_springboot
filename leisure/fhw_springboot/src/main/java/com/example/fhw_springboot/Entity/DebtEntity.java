package com.example.fhw_springboot.Entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
public class DebtEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer popId;

    private Integer cityId;

    private BigDecimal amount;
    private BigDecimal freezingAmount;
    private Integer cooperativeMode;

    private BigDecimal producingAmount;
    private Long refBillId;

    private Long cUserId;

    private String cUserName;

    private Long uUserId;

    private String uUserName;


}
