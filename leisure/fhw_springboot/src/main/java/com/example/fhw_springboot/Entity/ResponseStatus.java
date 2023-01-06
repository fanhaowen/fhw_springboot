package com.example.fhw_springboot.Entity;

public enum ResponseStatus {

    SUCCESS(0,"成功"),
    FAIL(1,"失败"),
    EXCEPTION(2,"服务异常"),
    PARAM_ERROR(3, "参数错误")
    ;

    public int code;
    public String msg;

    ResponseStatus(int code,String msg) {
        this.code = code;
        this.msg = msg;
    }

}
