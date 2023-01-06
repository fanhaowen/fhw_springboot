package com.example.fhw_springboot.Service;

import com.example.fhw_springboot.Dao.MarginDao;
import com.example.fhw_springboot.Entity.*;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

@Service
public class MarginAmountService implements Runnable{
    @Resource
    private MarginDao marginDao;
    public static MarginAmountService instance = new MarginAmountService();
    public static Integer j = 0;
    @Override
    public synchronized void run() {
        for (int i=0;i<10000;i++) {
            j++;
        }
    }
    public List<MarginAmountSumEntity> sumRecAmount(Integer[] popIds, Integer[] status) {
        return marginDao.sumRecAmount(popIds, status);
    }

    public List<MarginAmountSumEntity> sumRefundAmount(Integer[] popIds) {
        Integer[] refundAmountStatus = new Integer[]{MarginAmountRefundStatus.IN_REVIEW.status,
                MarginAmountRefundStatus.PASS_REVIEW.status, MarginAmountRefundStatus.APPLY_REFUND.status,
                MarginAmountRefundStatus.FI_PASS.status, MarginAmountRefundStatus.REFUND_SUCCESS.status};
        return marginDao.sumRefundAmount(popIds, refundAmountStatus);
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(instance);
        Thread t2 = new Thread(instance);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(j);
    }
    public static void changeParam(MarginConfigEntity entity) {
        entity.setPopId(123L);
    }

}

