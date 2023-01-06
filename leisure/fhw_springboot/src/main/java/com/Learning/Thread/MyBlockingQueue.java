package com.Learning.Thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class MyBlockingQueue {
    private static final BlockingQueue<String> queue = new ArrayBlockingQueue<>(5);
    private static final BlockingQueue<String> linkedQueue = new LinkedBlockingQueue<>();
    //提供了take()和put()方法，如果队列已达最大值，put方法将会被阻塞，如果队列已空，take方法将会被阻塞.
    //offer 如果队列没满，立即返回TRUE并加入到队列，如果队列已满，立即返回FALSE，不阻塞
    //入队: put, offer, offer(E e, long timeout, TimeUnit unit)
    //put: 如果队列已达最大值，put方法将会被阻塞
    //offer: 如果队列已达最大值，直接返回FALSE
    //offer(param)： 如果队列已达最大值，阻塞指定时间后返回FALSE
    //出队: poll, take, poll(long timeout, TimeUnit unit)
    //take: 如果已空，一直阻塞
    //poll: 如果已空，直接返回null
    //poll(param): 如果已空，阻塞指定时间后返回null
    static class Producer extends Thread {
        String id;
        Producer(String id) {
            this.id = id;
        }
        @Override
        public void run() {
            try {
                queue.put(id);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("produce..."+id);
        }
    }

    static class Consumer extends Thread {
        @Override
        public void run() {
            try {
                String product = queue.take();
                System.out.println(product);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws Exception{
        for (int i=0;i<2;i++) {
            Thread.sleep(10);
            Producer producer = new Producer(String.valueOf(i+1));
            producer.start();
        }
        for (int i=0;i<5;i++) {
            Thread.sleep(10);
            Consumer consumer = new Consumer();
            consumer.start();
        }
        for (int i=2;i<5;i++) {
            Thread.sleep(10);
            Producer producer = new Producer(String.valueOf(i+1));
            producer.start();
        }
    }
}
