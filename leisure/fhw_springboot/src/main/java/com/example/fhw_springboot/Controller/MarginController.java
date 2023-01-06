package com.example.fhw_springboot.Controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.example.fhw_springboot.Annotation.My1stAnnotation;
import com.example.fhw_springboot.Annotation.MyGetter;
import com.example.fhw_springboot.Dao.DebtDao;
import com.example.fhw_springboot.Dao.MarginDao;
import com.example.fhw_springboot.Entity.*;
import com.example.fhw_springboot.Service.MarginAmountService;
import com.example.fhw_springboot.Service.MarginService;
import com.example.fhw_springboot.Tools.DownloadUtil;
import com.example.fhw_springboot.Tools.MoneyUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.CollectionUtils;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.*;

import static com.example.fhw_springboot.Service.MarginService.calendar;

@Slf4j
@RestController
@RequestMapping("/testMargin")
public class MarginController {
    @Resource
    private MarginService marginService;
    @Resource
    private MarginDao marginDao;
    @Resource
    private DebtDao debtDao;
    @Resource
    private DownloadUtil downloadUtil;
    @Resource
    private MarginAmountService amountService;
    @RequestMapping("getId/{id}")
    public String queryById(@PathVariable Long id) {
        List<MarginConfigEntity> list = new ArrayList<>();
        MarginConfigEntity e = new MarginConfigEntity();
        e.setPopId(555L);
        e.setBillRate(new BigDecimal(20));
        list.add(e);
        MarginConfigEntity m = new MarginConfigEntity();
        m.setPopId(666L);
        m.setBillRate(new BigDecimal(25));
        list.add(m);
        String res = JSONObject.toJSONString(debtDao.queryConfigListForUpdate(list));
        int length = 10;
        int page = 20;

        Long offset = (long) length * (long) page;
        return JSON.toJSONString(offset);
    }

    @RequestMapping("test/{popId}")
    public String test() throws IOException {
        BigDecimal rate = new BigDecimal("0.55");
        int res = rate.divideAndRemainder(BigDecimal.ONE)[1].compareTo(BigDecimal.ZERO);
        MarginConfigEntity e = new MarginConfigEntity();
        e.setcT(1);
        marginDao.getAllConfig();
        return String.valueOf(e);
    }

}
