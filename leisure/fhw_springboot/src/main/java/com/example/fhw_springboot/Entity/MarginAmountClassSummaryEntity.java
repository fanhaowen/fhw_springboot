package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;

public class MarginAmountClassSummaryEntity {
    /**
     * 主键
     */
    private Long id;

    /**
     * popId
     */
    private Long popId;

    /**
     * 城市id
     */
    private Long cityId;

    /**
     * 一级分类id
     */
    private Long class1Id;

    /**
     * 二级分类id
     */
    private Long class2Id;

    /**
     * 计算周期开始时间
     */
    private Integer startTime;

    /**
     * 计算周期结束时间
     */
    private Integer endTime;

    /**
     * 总交易额
     */
    private BigDecimal totalTradeVolume;

    /**
     * 日均交易额
     */
    private BigDecimal dailyAverageTradeVolume;

    /**
     * 交易天数
     */
    private Integer saleDays;

    /**
     * 浮动天数
     */
    private Integer floatDays;

    /**
     * 浮动保证金
     */
    private BigDecimal floatAmount;

    /**
     * 是否收取保证金,0:不收取,1:收取
     */
    private Integer isCollect;

    /**
     * 按城市维度汇总表主键
     */
    private Long fCitySumId;

    /**
     * 创建时间
     */
    private Long cT;

    /**
     * 更新时间
     */
    private Long uT;

    /**
     * 是否删除,0:未删除,1:已删除
     */
    private Integer isDeleted;
}