package com.example.fhw_springboot.Entity;

public class PageDto extends BaseDto {

    private static final long serialVersionUID = -3103341355929532940L;

    /**
     * 当前页
     */
    private int page = 1;

    /**
     * 每页显示行数
     */
    private int length = 10;

    /**
     * beginIndex
     */
    private int beginIndex = 0;

    /**
     * 是否启用分页
     */
    private boolean pageEnable;

    /**
     * 偏移量 通常是id或者不重复的编码
     */
    private Long offset = 0L;

    /*
     * 是否只返回数量
     */
    private boolean isCount = true;

    /*
     * 上一个结果集中最后一条记录的ID
     */
    private Long lastId = 0L;

    public Long getLastId() {
        return lastId;
    }

    public void setLastId(Long lastId) {
        this.lastId = lastId;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBeginIndex() {
        return beginIndex = (page - 1) * length;
    }

    public void setBeginIndex(int beginIndex) {
        this.beginIndex = beginIndex;
    }

    public boolean isPageEnable() {
        return pageEnable;
    }

    public void setPageEnable(boolean pageEnable) {
        this.pageEnable = pageEnable;
    }

    public Long getOffset() {
        return offset;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public boolean isCount() {
        return isCount;
    }

    public void setCount(boolean isCount) {
        this.isCount = isCount;
    }

}
