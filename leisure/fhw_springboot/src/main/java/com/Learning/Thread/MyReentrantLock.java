package com.Learning.Thread;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyReentrantLock {
    //可重入锁
    //默认非公平锁，显式的设置TRUE为公平锁
    static Lock fairLock = new ReentrantLock(true);
    static Lock unfairLock = new ReentrantLock();
    static class ThreadCompetition implements Runnable {
        int id;
        ThreadCompetition(int id) {
            this.id = id;
        }
        @Override
        public void run() {
            try {

                TimeUnit.MILLISECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (int i=0;i<2;i++) {
                fairLock.lock();
                System.out.println("获得锁的线程: " + id);
//                lock.unlock();
                if (i != 0) {
                    fairLock.unlock();
                }
            }

        }
    }

    static class ThreadMustDead implements Runnable{
        Lock lock1;
        Lock lock2;
        ThreadMustDead(Lock lock1, Lock lock2) {
            this.lock1 = lock1;
            this.lock2 = lock2;
        }

        @Override
        public void run() {
            try {
                lock1.lock();
                System.out.println("拿到一个锁，准备拿第二个锁");
                Thread.sleep(10);
                lock2.lock();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock1.unlock();
                lock2.unlock();
            }
        }
    }

    static class ThreadNeverDead implements Runnable {
        Lock lock1;
        Lock lock2;
        Integer id;
        ThreadNeverDead(Lock lock1, Lock lock2, Integer threadId) {
            this.lock1 = lock1;
            this.lock2 = lock2;
            this.id = threadId;
        }

        @SneakyThrows
        @Override
        public void run() {
            System.out.println("begin");
            while(true) {
                while (!lock1.tryLock()) {
                    System.out.println("没拿到锁1,继续"+id);
                    Thread.sleep(10);
                }
                System.out.println("拿到锁1"+id);
                if (!lock2.tryLock()) {
                    System.out.println("没拿到锁2，释放锁1，again"+id);
                    lock1.unlock();
                } else {
                    System.out.println("拿到锁1和锁2，释放结束"+id);
                    lock1.unlock();
                    lock2.unlock();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        // 竞争锁
        competition();
        //死锁
//        mustDead();
        //避免死锁
//        avoidDead();

    }
    public static void competition() {
        for (int i=0;i<5;i++) {
            new Thread(new ThreadCompetition(i)).start();
        }
    }
    public static void mustDead() {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute( () -> {
            new ThreadMustDead(fairLock, unfairLock).run();
        });
        service.execute( () -> {
            new ThreadMustDead(unfairLock, fairLock).run();
        });
        service.shutdown();
    }
    public static void avoidDead() {
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute( () -> {
            new ThreadNeverDead(fairLock, unfairLock, 1).run();
        });
        service.execute( () -> {
            new ThreadNeverDead(unfairLock, fairLock, 2).run();
        });
        service.shutdown();
    }

}
