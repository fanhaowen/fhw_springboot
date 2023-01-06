package com.example.fhw_springboot.Entity;

import java.math.BigDecimal;
import java.util.List;

public class MarginAmountCitySummaryEntity {
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
     * 城市最低收取保证金
     */
    private BigDecimal cityLowestAmount;

    /**
     * 商家在该城市最低收取保证金
     */
    private BigDecimal popLowestAmount;

    /**
     * 按分类计算的浮动保证金
     */
    private BigDecimal floatAmount;

    /**
     * 计算周期开始时间
     */
    private Integer startTime;

    /**
     * 计算周期结束时间
     */
    private Integer endTime;

    /**
     * 保证金收取依据：1按城市最低收取,2按商家城市最低收取,3按浮动收取
     */
    private Integer basisType;

    /**
     * 应收保证金
     */
    private BigDecimal recAmount;

    /**
     * 按商家维度汇总表主键
     */
    private Long fPopSumId;

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

    List<MarginAmountClassSummaryEntity> classSummaryEntities;
}
