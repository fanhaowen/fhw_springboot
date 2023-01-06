package com.example.fhw_springboot.Entity;


import java.io.Serializable;
import java.math.BigDecimal;

public class DebtModel implements Serializable {
    private Long id;
    private Integer popId;
    private Integer cityId;
    private BigDecimal amount;
    private BigDecimal freezingAmount;
    private Integer cooperativeMode;
    private Long refBillId;
    private Long cuserId;
    private String cuserName;
    private Long uuserId;
    private String uuserName;
}
