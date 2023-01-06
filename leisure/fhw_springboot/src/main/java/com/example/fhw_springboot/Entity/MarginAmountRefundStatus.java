package com.example.fhw_springboot.Entity;

public enum MarginAmountRefundStatus {

    /** 已取消 **/
    CANCEL(0, "已取消"),

    /** 待审核 **/
    IN_REVIEW(1, "待审核"),

    /** 审核通过 **/
    PASS_REVIEW(2, "审核通过"),

    /** 申请退款 **/
    APPLY_REFUND(3, "申请退款"),

    /** 审核不通过 **/
    REJECT_REVIEW(8, "审核不通过"),

    /** 财务通过 **/
    FI_PASS (10, "财务通过"),

    /** 财务打回 **/
    FI_NO_PASS(15, "财务打回"),

    /** 退款成功 **/
    REFUND_SUCCESS (20, "退款成功"),

    /** 退款失败 **/
    REFUND_FAILURE(30, "退款失败")

    ;

    public int		status;
    public String	dec;

    MarginAmountRefundStatus(int status, String dec) {
        this.status = status;
        this.dec = dec;
    }

    public static String getStatusDec(int state) {
        MarginAmountRefundStatus[] values = MarginAmountRefundStatus.values();
        for (MarginAmountRefundStatus value : values) {
            if (value.status == state){
                return value.dec;
            }
        }
        return "--";
    }

    public static MarginAmountRefundStatus get(int status){
        MarginAmountRefundStatus[] values = MarginAmountRefundStatus.values();
        for(MarginAmountRefundStatus value : values){
            if(value.status == status){
                return value;
            }
        }
        return null;
    }

}
