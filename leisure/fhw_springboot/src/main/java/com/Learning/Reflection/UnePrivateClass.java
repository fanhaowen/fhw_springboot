package com.Learning.Reflection;

import java.math.BigDecimal;

public class UnePrivateClass {
    public BigDecimal amount = new BigDecimal(100);

    private BigDecimal addAmountPrivate(BigDecimal bigDecimal) {
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
