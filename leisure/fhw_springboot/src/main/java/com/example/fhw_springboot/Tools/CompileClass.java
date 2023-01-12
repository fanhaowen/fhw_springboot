package com.example.fhw_springboot.Tools;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompileClass {
    @Data
    public static class Response<T> implements Serializable {
        private static final long serialVersionUID = 2519938312161575988L;
        protected Integer status;
        protected Integer retCode;
        protected String retMsg;
        protected String extRetCode;
        protected String extRetMsg;
        protected String userMsg;
        protected T data;
    }
    public static void main(String[] args) {


    }
    public Response<String> retStringList() {
        Response res = new Response();
        List<String> stringList = new ArrayList<>();
        res.setData(stringList);
        return res;
    }
}
