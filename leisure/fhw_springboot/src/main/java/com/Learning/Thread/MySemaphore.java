package com.Learning.Thread;

import java.util.concurrent.*;

public class MySemaphore {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        final int maxRunningThread = 3;
        final int totalReq = 10;
        Semaphore semaphore = new Semaphore(maxRunningThread);
        for (int i=0;i<totalReq;i++) {
            executorService.execute( () -> {
                try {
                    semaphore.acquire();
                    System.out.println("semaphore get, remainder: " + semaphore.availablePermits());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    System.out.println("handle done, release");
                    semaphore.release();
                }
            });
        }
        executorService.shutdown();
        CopyOnWriteArraySet<String> set = new CopyOnWriteArraySet<String>();
        set.add("123");
        System.out.println(set);
    }
}
