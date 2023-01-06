package com.Learning.Thread;

import com.example.fhw_springboot.Entity.MarginConfigEntity;
import lombok.SneakyThrows;

import java.util.concurrent.Callable;

public class MyThread  {
    public static void main(String[] args) throws InterruptedException {

    }
}

class T1 extends Thread {
    private final Object lock1;
    private final Object lock2;
    T1(Object lock1, Object lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }
    @SneakyThrows
    @Override
    public void run() {

    }
}

class T2 extends Thread {
    Thread t1 = null;
    public void setT1(Thread t1) {
        this.t1 = t1;
    }
    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            Thread.sleep(1000);
            System.out.println("T2吃了一个包子，T2准备休息");
            Thread.currentThread().wait();
        }
    }
}
