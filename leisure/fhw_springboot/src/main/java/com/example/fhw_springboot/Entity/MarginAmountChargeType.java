package com.example.fhw_springboot.Entity;

public enum MarginAmountChargeType {

    /** 不收取 **/
    NO(1, "不收取"),

    /** 银行转账 **/
    TRANSFER_ACCOUNTS (2, "银行转账"),

    /** 货款抵扣 **/
    DEDUCTION(3, "货款抵扣");

    public int		type;
    public String	dec;

    MarginAmountChargeType(int type, String dec) {
        this.type = type;
        this.dec = dec;
    }

    public static String getDec(int state) {
        MarginAmountChargeType[] values = MarginAmountChargeType.values();
        for (MarginAmountChargeType value : values) {
            if (value.type == state){
                return value.dec;
            }
        }
        return "--";
    }

}
