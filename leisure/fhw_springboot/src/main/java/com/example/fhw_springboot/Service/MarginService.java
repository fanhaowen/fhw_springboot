package com.example.fhw_springboot.Service;

import com.alibaba.fastjson.JSON;
import com.example.fhw_springboot.Annotation.My1stAnnotation;
import com.example.fhw_springboot.Dao.MarginAmountConfigDao;
import com.example.fhw_springboot.Dao.MarginDao;
import com.example.fhw_springboot.Entity.*;
import com.example.fhw_springboot.Tools.MoneyUtil;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
public class MarginService extends BaseService{
    @Resource
    private MarginDao marginDao;
    @Resource
    private MarginAmountService marginAmountService;
    @Resource
    private MarginAmountConfigDao marginAmountConfigDao;
    public MarginAmountRefundEntity queryMarginInfoById(Long id) {
        return marginDao.queryById(id);
    }
    public static Calendar calendar() {
        Calendar cal = Calendar.getInstance(Locale.CHINESE);
        cal.setFirstDayOfWeek(2);
        return cal;
    }
    @My1stAnnotation(desc = "我靠")
    public String test(Long popId){
        Integer settleTime = marginDao.test(popId);
        Integer count = marginDao.exitsUnSettleSettleCostRecord(popId, settleTime);
        if (Objects.isNull(count)) {
            return "没有未绑定的日账单";
        }
        return "有未绑定的日账单";
    }

    public ServiceResult<MarginAmountInfoDto> getMarginInfo(Integer popId) {
        String uuId = UUID.randomUUID().toString();
        if (popId == null) {
            return ServiceResultWrap.wrapFail(null, "参数无效");
        }
        MarginAmountInfoDto result = new MarginAmountInfoDto();
        MarginAmountConfigEntity marginAmountConfigEntity = marginDao.selectCurrentMarginConfig(popId);
        logger.info(JSON.toJSONString(marginAmountConfigEntity));
        if (marginAmountConfigEntity != null) {
            result.setPopId(marginAmountConfigEntity.getPopId());
            result.setChargeType(marginAmountConfigEntity.getMarginAmountType());
            result.setConfigMoney(marginAmountConfigEntity.getMarginAmount());
            if (MarginAmountChargeType.DEDUCTION.type == marginAmountConfigEntity.getMarginAmountType()) {
                // 已收+收取中 -(已退+退款中)
                BigDecimal recAmount = getRecAmount(marginAmountConfigEntity.getPopId());
                // 本次应收
                BigDecimal curreentRecNeedAmount = MoneyUtil.sub(marginAmountConfigEntity.getMarginAmount(), recAmount);

                //已收
                BigDecimal recHadAmount = sumRecHadAmount(marginAmountConfigEntity.getPopId());
                //正在收
                BigDecimal recingAmount = sumRecingAmount(marginAmountConfigEntity.getPopId());
                result.setRecHadMoney(recHadAmount);
                result.setRecingMoney(recingAmount);
                //已退,REFUND_SUCCESS
                BigDecimal refundHadAmount = sumRefundHadAmount(marginAmountConfigEntity.getPopId());
                //在退,IN_REVIEW,PASS_REVIEW,APPLY_REFUND,FI_PASS
                BigDecimal refundingAmount = sumRefundingAmount(marginAmountConfigEntity.getPopId());
                result.setRefundHadMoney(refundHadAmount);
                result.setRefundingMoney(refundingAmount);


                result.setId(marginAmountConfigEntity.getId());
                result.setEachBillDeductProportion(marginAmountConfigEntity.getEachBillDeductProportion());
                result.setRecNeedAmount(curreentRecNeedAmount);
            }
            return ServiceResultWrap.wrapSuccess(result);
        }
        return ServiceResultWrap.wrapFail(null, "查询失败");
    }
    public BigDecimal getRecAmount(Integer popId) {
        // 已收保证金 包括正在收取的
        return MoneyUtil.sub(sumRecAmount(popId), sumRefundAmount(popId));
    }
    private BigDecimal sumRecAmount(Integer popId) {
        List<MarginAmountSumEntity> list = marginAmountService.sumRecAmount(new Integer[] { popId },
                new Integer[] { MarginAmountRecStatus.REC_SUCCESS.status, MarginAmountRecStatus.IN_REVIEW.status });
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0).getAmount();
        }
        return BigDecimal.ZERO;
    }
    private BigDecimal sumRefundAmount(Integer popId) {
        List<MarginAmountSumEntity> list = marginAmountService.sumRefundAmount(new Integer[] { popId });
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0).getAmount();
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal sumRecHadAmount(Integer popId) {
        List<MarginAmountSumEntity> list = marginAmountService.sumRecAmount(new Integer[] { popId },
                new Integer[] { MarginAmountRecStatus.REC_SUCCESS.status});
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0).getAmount();
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal sumRecingAmount(Integer popId) {
        List<MarginAmountSumEntity> list = marginAmountService.sumRecAmount(new Integer[] { popId },
                new Integer[] { MarginAmountRecStatus.IN_REVIEW.status});
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0).getAmount();
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal sumRefundHadAmount(Integer popId) {
        Integer[] refundAmountStatus = new Integer[]{
                MarginAmountRefundStatus.REFUND_SUCCESS.status};
        List<MarginAmountSumEntity> list = marginDao.sumRefundAmount(new Integer[]{popId}, refundAmountStatus);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0).getAmount();
        }
        return BigDecimal.ZERO;
    }
    public BigDecimal sumRefundingAmount(Integer popId) {
        Integer[] refundAmountStatus = new Integer[]{
                MarginAmountRefundStatus.IN_REVIEW.status,
                MarginAmountRefundStatus.PASS_REVIEW.status, MarginAmountRefundStatus.APPLY_REFUND.status,
                MarginAmountRefundStatus.FI_PASS.status};
        List<MarginAmountSumEntity> list = marginDao.sumRefundAmount(new Integer[]{popId}, refundAmountStatus);
        if (CollectionUtils.isNotEmpty(list)) {
            return list.get(0).getAmount();
        }
        return BigDecimal.ZERO;
    }
}
