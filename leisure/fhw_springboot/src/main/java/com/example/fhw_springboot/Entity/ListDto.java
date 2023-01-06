package com.example.fhw_springboot.Entity;

import java.util.List;

public class ListDto<T> extends BaseDto {

    private static final long serialVersionUID = 8866140162185971628L;

    /**
     * 总数据量
     */
    private int total;

    /**
     * dataList
     */
    private List<T> data;

    public ListDto() {

    }

    public ListDto(List<T> data, int total) {
        this.data = data;
        this.total = total;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

}
