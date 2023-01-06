package com.example.fhw_springboot.Entity;

public class ServiceResultWrap {

    public static <T> ServiceResult<T> wrapResult(T data,int code,String msg){
        ServiceResult<T> result = new ServiceResult<T>();
        result.setErrorCode(code);
        result.setMessage(msg);
        result.setBody(data);
        if(code==ResponseStatus.SUCCESS.code){
            result.setSuccess(true);
        }else{
            result.setSuccess(false);
        }

        return result;
    }

    public static <T> ServiceResult<T> wrapSuccess(T data){
        return wrapResult(data,ResponseStatus.SUCCESS.code, ResponseStatus.SUCCESS.msg);
    }

    public static <T> ServiceResult<T> wrapFail(T data,String msg){
        if(null==msg){
            msg =  ResponseStatus.FAIL.msg;
        }
        return wrapResult(data,ResponseStatus.FAIL.code,msg);
    }

    public static <T> ServiceResult<T> wrapException(T data,String msg){
        if(null==msg){
            msg =  ResponseStatus.EXCEPTION.msg;
        }
        return wrapResult(data,ResponseStatus.EXCEPTION.code,msg);
    }
    public static <T> ServiceResult<T> wrapError(Integer code
            ,String msg){
        ServiceResult<T> result = new ServiceResult<T>();
        result.setErrorCode(code);
        result.setMessage(msg);
        result.setBody(null);
        result.setSuccess(false);
        return result;
    }
}