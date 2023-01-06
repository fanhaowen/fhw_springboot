package com.example.fhw_springboot.Entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class RuleStandardParam {
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
     * 分页用
     */
    Integer offset;
    Integer length;
    Long uUserId;
    String uUserName;
    Boolean forUpdate;
}
