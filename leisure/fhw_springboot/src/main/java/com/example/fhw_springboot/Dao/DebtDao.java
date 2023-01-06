package com.example.fhw_springboot.Dao;

import com.example.fhw_springboot.Entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface DebtDao {

    int updateBillRate(@Param("uUserName") String uUserName,
                       @Param("uUserId") Long uUserId,
                       @Param("list") List<MarginConfigEntity> list);
    List<MarginConfigEntity> queryConfigListForUpdate(@Param("list") List<MarginConfigEntity> entities);

    void insert(DebtEntity entity);
}
