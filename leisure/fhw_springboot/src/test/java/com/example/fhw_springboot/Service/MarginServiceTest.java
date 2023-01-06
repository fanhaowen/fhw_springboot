package com.example.fhw_springboot.Service;

import com.alibaba.fastjson.JSONObject;
import com.example.fhw_springboot.Dao.MarginDao;
import com.example.fhw_springboot.Entity.MarginAmountRefundEntity;
import com.example.fhw_springboot.Entity.RuleStandardEntity;
import com.example.fhw_springboot.Entity.RuleStandardParam;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
class MarginServiceTest {

    @Resource
    private MarginDao marginDao;

    @Test
    void queryMarginInfoById() {

        RuleStandardParam queryParam = new RuleStandardParam();
        queryParam.setId(63L).setForUpdate(true);
        List<RuleStandardEntity> entity = marginDao.queryRuleByParam(queryParam);
        if (entity.isEmpty()) {
            System.out.println("没查到");
            return;
        }
        RuleStandardParam updateParam = new RuleStandardParam();
        int now = (int) (System.currentTimeMillis() / 1000);
        updateParam.setEffective(2)
                .setId(63L)
                .setActualEndTime(now);

        //该规则的开始时间还没到，也就是该规则从未被激活过
        System.out.println("now:"+entity.get(0).getStartTime());
        System.out.println(now);
        if (now < entity.get(0).getStartTime()) {
            updateParam.setActualEndTime(-1);
        }
        System.out.println(JSONObject.toJSONString(updateParam));
    }

    @Test
    void getMarginInfo() {
    }

    @Test
    void getRecAmount() {
    }

    @Test
    void sumRecHadAmount() {
    }

    @Test
    void sumRecingAmount() {
    }

    @Test
    void sumRefundHadAmount() {
    }

    @Test
    void sumRefundingAmount() {
    }
}