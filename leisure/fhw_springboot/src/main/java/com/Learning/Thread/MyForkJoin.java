package com.Learning.Thread;

import lombok.SneakyThrows;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.Future;
import java.util.concurrent.RecursiveTask;

public class MyForkJoin {
    static class ForkJoinExample extends RecursiveTask<Integer> {
        //粒度，门槛,当任务的长度小于等于threshold的时候，认为已经是最小粒度，可以执行，否则分解
        private final int threshold = 5;
        private int first;
        private int last;
        ForkJoinExample(int f, int l) {
            this.first = f;
            this.last = l;
        }
        @SneakyThrows
        @Override
        protected Integer compute() {
            int res = 0;
            if (last - first <= threshold)  {
                //任务足够小
                for (int i=first;i<last;i++) {
                    res += i;
                }
            } else {
                //拆分
                int middle = first + (last-first)/2;
                ForkJoinExample leftTask = new ForkJoinExample(first, middle);
                ForkJoinExample rightTask = new ForkJoinExample(middle, last);
                //安排在当前任务正在运行的池中异步执行该任务.
                leftTask.fork();
                rightTask.fork();
                res = leftTask.get() + rightTask.get();
            }
            return res;
        }
    }

    public static void main(String[] args) throws Exception {
        ForkJoinExample example = new ForkJoinExample(1, 1000000);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        Future<Integer> result = forkJoinPool.submit(example);
        System.out.println(result.get());
    }
}
