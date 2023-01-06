package com.example.fhw_springboot.Entity;

public enum MarginAmountRecStatus {

    /** 待审核 **/
    IN_REVIEW(0, "待审核"),
    /** 收款失败 **/
    REC_FAILURE(1, "收款失败"),
    /** 收款成功 **/
    REC_SUCCESS (2, "收款成功"),
    /** 审核不通过 **/
    REJECT_REVIEW(3, "审核不通过")

    ;

    public int		status;
    public String	dec;

    MarginAmountRecStatus(int status, String dec) {
        this.status = status;
        this.dec = dec;
    }

    public static String getStatusDec(int state) {
        MarginAmountRecStatus[] values = MarginAmountRecStatus.values();
        for (MarginAmountRecStatus value : values) {
            if (value.status == state){
                return value.dec;
            }
        }
        return "--";
    }

    public static MarginAmountRecStatus get(int status){
        MarginAmountRecStatus[] values = MarginAmountRecStatus.values();
        for(MarginAmountRecStatus value : values){
            if(value.status == status){
                return value;
            }
        }
        return null;
    }

}
