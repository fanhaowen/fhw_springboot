package com.Learning.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyCondition {
    //Condition类来实现线程之间的协调
    //主要是通过await(), signal(), signalAll() 方法
    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();

    public void before() {
        lock.lock();
        try {
            System.out.println("before");
            condition.signal();
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void after() {
        lock.lock();
        try {
            condition.await();
            System.out.println("after");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        MyCondition myCondition = new MyCondition();

        executorService.execute(myCondition::after);
        executorService.execute(myCondition::before);

        executorService.shutdown();
    }
}
