package com.example.fhw_springboot.Controller;

import com.example.fhw_springboot.Service.DebtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

@RestController
@RequestMapping("/debt")
public class DebtController {
    @Resource
    private DebtService debtService;
    @RequestMapping("insert/{insertNum}")
    public int insertRandom(@PathVariable("insertNum") Integer insertNum) {
        debtService.insertDao(insertNum);

        return 1;
    }
}
