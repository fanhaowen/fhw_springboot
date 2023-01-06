package com.example.fhw_springboot.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.fhw_springboot.Dao.DebtDao;
import com.example.fhw_springboot.Entity.DebtEntity;
import com.example.fhw_springboot.manage.MarginManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

@Service
public class DebtService {
    @Resource
    private DebtDao debtDao;




    public boolean tryDubbo() {
        RedisTemplate<String, String> redisTemplate = new RedisTemplate<>();
        redisTemplate.opsForHash().put("hash", "", "");
        return false;
    }
    public void confirmDubbo() {

    }
    public void insertDao(Integer insertNum) {
        Object o = SingletonLazy.getObj();

        for (int i = 0; i < insertNum; i++) {
            DebtEntity debtEntity = new DebtEntity();
            Random random = new Random();
            int money = random.nextInt(1000000);
            debtEntity.setAmount(BigDecimal.valueOf(money));
            int userId = random.nextInt(1000000);
            debtEntity.setPopId(userId);
            debtEntity.setCUserId(1L);
            debtEntity.setCUserName("系统初始化");
            debtEntity.setCityId(1);
            debtEntity.setCooperativeMode(3);
            debtEntity.setRefBillId(0L);
            debtEntity.setUUserId(1L);
            debtEntity.setUUserName("系统初始化");
            debtEntity.setFreezingAmount(BigDecimal.ZERO);
            debtEntity.setProducingAmount(BigDecimal.ZERO);
            System.out.println(JSONObject.toJSONString(debtEntity));
            try {
                debtDao.insert(debtEntity);
            } catch (Exception e) {
                e.printStackTrace();
            }



        }
    }
}
