package com.example.fhw_springboot.Service;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import javax.annotation.Resource;

import com.alibaba.fastjson.JSONObject;
import com.example.fhw_springboot.Entity.BaseEntity;
import com.example.fhw_springboot.Entity.DebtFreezeEntity;
import com.example.fhw_springboot.Entity.MarginConfigEntity;
import org.dozer.Mapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import sun.misc.VM;

public class BaseService  {
    protected Logger logger = LoggerFactory.getLogger(this.getClass());
    boolean flag = true;
    public void updateFlag() {
        this.flag = false;
        System.out.println("修改flag值为：" + this.flag);
    }
    static int intA = 1;
    public static void main(String[] args) throws Exception {

    }

    public static class exam implements Runnable{
        @Override
        public void run() {
            func(Thread.currentThread().getName());
        }

        public  void func(String name) {
            for (int i=0;i<1000;i++) {
                intA++;
            }
        }
    }


    public static void futureTest() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ArrayList<Future<String>> futures = new ArrayList<>();
        System.out.println("公司让你通知大家聚餐 你开车去接人");
        Future<String> future10 = executorService.submit( () -> {
            System.out.println("总裁：我在家上大号 我最近拉肚子比较慢 要蹲1个小时才能出来 你等会来接我吧");
            Thread.sleep(3000);
            System.out.println("总裁：1小时了 我上完大号了。你来接吧");
            return "总裁上完大号了";
        });
        futures.add(future10);
        Future<String> future3 = executorService.submit( () -> {
            System.out.println("研发：我在家上大号 我比较快 要蹲3分钟就可以出来 你等会来接我吧");
            Thread.sleep(1000);
            System.out.println("研发：3分钟 我上完大号了。你来接吧");
            return "研发上完大号了";
        });
        futures.add(future3);
        Future<String> future6 = executorService.submit(() -> {
            System.out.println("中层管理：我在家上大号  要蹲10分钟就可以出来 你等会来接我吧");
            Thread.sleep(2000);
            System.out.println("中层管理：10分钟 我上完大号了。你来接吧");
            return "中层管理上完大号了";
        });
        futures.add(future6);
        System.out.println("都通知完了,等着接吧。");
        try {
            for (Future<String> future : futures) {
                String str = future.get();
                System.out.println(str + ",你去接他");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(executorService.isShutdown());
        executorService.shutdown();
    }
}

