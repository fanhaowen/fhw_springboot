package com.example.fhw_springboot.Entity;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 5335161690920887303L;

    /**
     * 是否可以为NULL：no
     * 列类型：bigint(20) unsigned
     * 默认值：
     * 列的数据类型的长度：20.0
     * 列注释：主键
     * 列的扩展：auto_increment
     * 列名：id
     * 列的数据类型：bigint
     * 是否是主键：是
     */
    private Long id;
    /**
     * 是否可以为NULL：no
     * 列类型：int(11) unsigned
     * 默认值：
     * 列的数据类型的长度：10.0
     * 列注释：创建时间
     * 列的扩展：
     * 列名：c_t
     * 列的数据类型：int
     * 是否是主键：否
     */
    private Integer ct;

    /**
     * 是否可以为NULL：no
     * 列类型：int(11) unsigned
     * 默认值：
     * 列的数据类型的长度：10.0
     * 列注释：修改时间
     * 列的扩展：
     * 列名：u_t
     * 列的数据类型：int
     * 是否是主键：否
     */
    private Integer ut;

    /**
     * 是否可以为NULL：no
     * 列类型：tinyint(4) unsigned
     * 默认值：0
     * 列的数据类型的长度：3.0
     * 列注释：删除标识，0正常，1删除
     * 列的扩展：
     * 列名：is_deleted
     * 列的数据类型：tinyint
     * 是否是主键：否
     */
    private Integer isDeleted;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCt() {
        return ct;
    }

    public void setCt(Integer ct) {
        this.ct = ct;
    }

    public Integer getUt() {
        return ut;
    }

    public void setUt(Integer ut) {
        this.ut = ut;
    }

    public Integer getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Integer isDeleted) {
        this.isDeleted = isDeleted;
    }
}