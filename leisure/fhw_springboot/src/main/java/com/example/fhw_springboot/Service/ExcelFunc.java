package com.example.fhw_springboot.Service;

import com.example.fhw_springboot.Entity.PayEntity;
import com.example.fhw_springboot.Entity.PopPayEntity;
import com.example.fhw_springboot.Tools.MoneyUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ExcelFunc {
    public void popCompareWithPay(ExcelService popSheet, ExcelService paySheet, Integer rows) {
        List<PayEntity> pays = paySheet.readPay(rows);
        List<PopPayEntity> popPays = popSheet.readPopPay(rows);
        BigDecimal sumPOP = BigDecimal.ZERO;
        BigDecimal sumPAY = BigDecimal.ZERO;
        for (PopPayEntity e : popPays) {
            sumPOP = MoneyUtil.sum(sumPOP, e.getMoney());
        }
        for (PayEntity e : pays) {
            sumPAY = MoneyUtil.sum(sumPAY, e.getMoney());
        }
        sumPAY = MoneyUtil.scaleTwoPoint(sumPAY);
        System.out.println(sumPAY + " and " + sumPOP);
    }

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() / 1000);

    }
}
