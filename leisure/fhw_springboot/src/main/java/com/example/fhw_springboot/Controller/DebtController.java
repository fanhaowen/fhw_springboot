package com.example.fhw_springboot.Controller;

import com.example.fhw_springboot.Dao.InfoDao;
import com.example.fhw_springboot.Service.DebtService;
import generate.Info;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@RequestMapping("/debt")
public class DebtController {
    @Resource
    private InfoDao infoDao;
    @Resource
    private DebtService debtService;
    @RequestMapping("insert/{insertNum}")
    public String insertRandom(@PathVariable("insertNum") Integer insertNum) {
        Info info = new Info();
        info.setCid(1);
        info.setContent("哈哈哈");
        info.setCreateTime(new Date());
        info.setTitle("何为何");
        info.setUid(2);
        infoDao.insert(info);

        Info info1 = infoDao.selectByPrimaryKey(1);
        return info1.toString();
    }
}
