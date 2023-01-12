package com.Learning.Reflection;

import lombok.Data;
import org.springframework.core.annotation.AliasFor;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

public class UnePrivateClass {
    public BigDecimal amount = new BigDecimal(100);
    @AliasFor(value = "addAmount")
    private BigDecimal addAmountPrivate(BigDecimal bigDecimal) {
        System.out.println("我是private方法");
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return null;
        }
        this.amount = this.amount.add(bigDecimal);
        return new BigDecimal(this.amount.toString());
    }

    public BigDecimal addAmountPublic(BigDecimal bigDecimal) {
        if (bigDecimal.compareTo(BigDecimal.ZERO) < 0) {
            return null;
        }
        this.amount = this.amount.add(bigDecimal);
        return new BigDecimal(this.amount.toString());
    }

}
