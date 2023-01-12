package com.example.fhw_springboot.Service;



import java.util.*;


import com.example.fhw_springboot.Entity.BaseDto;
import com.example.fhw_springboot.Entity.PageDto;
import com.example.fhw_springboot.Tools.CompileClass;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: gcy
 * @Date: 2021/11/18/9:35
 * @Description:
 */
public class  test {
    public static void main(String[] args) {
        System.out.println(new Date());
    }

    public static CompileClass.Response<? extends BaseDto> retReps() {
        PageDto pageDto = new PageDto();
        CompileClass.Response<PageDto> dtoResponse = new CompileClass.Response<>();
        return dtoResponse;
    }




}
