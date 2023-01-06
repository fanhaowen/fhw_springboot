package com.example.fhw_springboot.Entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RuleStandardEntity {
    Long id;
    Long c1Id;
    Long c2Id;
    Long c3Id;
    String c1Name;
    String c2Name;
    String c3Name;
    /**
     * 通用名
     */
    Long biId;
    String biName;
    Integer cityId;
    String cityName;
    /**
     * 该规则是否生效，使用job去扫表维护该字段
     */
    Integer effective;
    Integer startTime;
    Integer endTime;
    /**
     * endTime为配置的结束时间，actualEndTime是实际的
     */
    Integer actualEndTime;
    /**
     * 操作人、新建规则、失效规则等
     */
    Long uUserId;
    String uUserName;
    Integer uT;


}

