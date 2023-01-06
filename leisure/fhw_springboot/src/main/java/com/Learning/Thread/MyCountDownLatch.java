package com.Learning.Thread;

import lombok.SneakyThrows;

import java.sql.DriverManager;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyCountDownLatch  {
    //CountDownLatch通过给出一个计数器，用await()方法实现阻塞，使用countDown()方法使计数器-1，当计数器为0时，await()会解除阻塞.
    static class TestCountDownLatch implements Runnable {
        CountDownLatch countDownLatch;
        TestCountDownLatch(CountDownLatch l) {
            this.countDownLatch = l;
        }
        @SneakyThrows
        @Override
        public void run() {
            System.out.println("3s后解锁");
            Thread.sleep(3000);
            countDownLatch.countDown();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final int totalThread = 10;
        CountDownLatch countDownLatch = new CountDownLatch(totalThread);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i=1;i<totalThread;i++) {
            service.execute( () -> {
                System.out.println("run..."+countDownLatch.getCount());
                countDownLatch.countDown();
            });
        }
        System.out.println("我已经准备开始了");
        TestCountDownLatch t = new TestCountDownLatch(countDownLatch);
        service.execute(t);
        countDownLatch.await();
        System.out.println("已解锁、done");
        service.shutdown();
    }
}
