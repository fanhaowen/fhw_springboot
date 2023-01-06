package com.example.fhw_springboot.Dao;

import com.example.fhw_springboot.Entity.*;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MarginDao {
    public MarginAmountRefundEntity queryById(@Param("id") Long id);
    public Integer test(@Param("popId") Long popId);
    List<MarginAmountSumEntity> sumRecAmount(@Param("popIds")Integer[] popIds, @Param("statusArr")Integer[] status);
    List<MarginAmountSumEntity> sumRefundAmount(@Param("popIds")Integer[] popIds, @Param("statusArr")Integer[] status);
    MarginAmountConfigEntity selectCurrentMarginConfig(Integer popId);
    Integer exitsUnSettleSettleCostRecord(@Param("popId") Long popId, @Param("settleTime") Integer settleTime);
    MarginAmountRefundModel getRefundById(@Param("id")Long id);
    MarginAmountRefundModel getRefundInfoById(@Param("id") Long id);

    Integer checkReceivingMargin(@Param("popId") Long popId);
    List<MarginAmountEntity> find(BaseDto dto);
    void insert(ExcelTemplateItem item);

    List<MarginConfigEntity> getAllConfig();

    void updateConfigForInit(MarginAmountConfigEntity entity);

    void insertRule(MarginRuleEntity entity);
    void insertConfigChangeLog(MarginConfigChangeLogEntity entity);

    List<MarginConfigEntity> queryConfigListPaging(@Param("entity") MarginConfigEntity entity, @Param("length") int length, @Param("offset") Long offset);

    List<MarginConfigChangeLogEntity> queryMarginConfigChangeLogByPopId(@Param("popId") Long popId);

    List<MarginConfigImportLogEntity> queryImportLog(@Param("status") List<MarginConfigImportLogEntity> entity, @Param("forUpdate") boolean forUpdate);

    List<MarginRuleEntity> queryAllRule();

    void insertRuleDetail(MarginRuleDetailEntity entity);

    List<RuleStandardEntity> queryRuleByParam(RuleStandardParam param);
}
