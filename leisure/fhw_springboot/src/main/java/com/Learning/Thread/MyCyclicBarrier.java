package com.Learning.Thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class MyCyclicBarrier {
    //循环屏障和CountDownLatch功能相仿，不过CyclicBarrier可以通过reset()方法循环使用
    static class TestCyclicBarrier implements Runnable{
        CyclicBarrier cyclicBarrier;
        TestCyclicBarrier(CyclicBarrier c) {
            this.cyclicBarrier = c;
        }
        @Override
        public void run() {
            System.out.println("3s后");
        }
    }

    public static void main(String[] args) throws InterruptedException, BrokenBarrierException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(10);
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i=1;i<10;i++) {
            //九个线程去等待
            service.execute( () -> {
                try {
                    System.out.println("我准备等待了"+cyclicBarrier.getNumberWaiting());
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        Thread.sleep(10);
        System.out.println("目前已经有"+cyclicBarrier.getNumberWaiting()+"个线程在等待");
        cyclicBarrier.await();
        System.out.println("攒够了10个线程在等待，已解锁阻塞");
        System.out.println("目前已经有"+cyclicBarrier.getNumberWaiting()+"个线程在等待");
        //调用reset()重新开始计数
        cyclicBarrier.reset();
        service.shutdown();
    }
}
