package com.example.fhw_springboot.Dao;

import com.example.fhw_springboot.Entity.MarginAmountConfigEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface MarginAmountConfigDao {
    MarginAmountConfigEntity selectCurrentMarginConfig(Integer popId);
}
