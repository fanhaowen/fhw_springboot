package com.Learning.Thread;

import java.util.concurrent.*;

public class MyFutureTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        FutureTask<Integer> futureTask = new FutureTask<>(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                int res = 0;
                for (int i=0;i<10;i++) {
                    Thread.sleep(100);
                    res++;
                }
                return res;
            }
        });
        executorService.execute(futureTask);
        Thread otherThread = new Thread( () -> {
            System.out.println("other task is running...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.execute(otherThread);
        System.out.println(futureTask.get());

        executorService.shutdown();
    }
}
