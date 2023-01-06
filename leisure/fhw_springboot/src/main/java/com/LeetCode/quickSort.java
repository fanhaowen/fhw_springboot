package com.LeetCode;

import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class quickSort {
    //快速排序标准法
    public static void sortNums(int[] nums) {
        quickSortFunc(nums, 0, nums.length-1);
    }
    public static void quickSortFunc(int[] nums, int low, int high) {
        //剪枝
//        if (high < nums.length - k) {
//            return;
//        }
        if (low < high) {
            int blankPit = partition(nums, low, high);
            quickSortFunc(nums, low, blankPit-1);
            quickSortFunc(nums, blankPit+1, high);
        }
    }
    /*
    要排序的部分，选取nums[low]作为对比值，遍历数组，将比flag小的值放到左边，将比flag大的值放到右边。
    比较秒的点在于，先从右边开始遍历，此时左指针是空闲的，他的值是flag，已经被提出来了，右指针发现匹配值后，将值发给左指针
    此时右指针的位置空出来了，又开始从左指针往右走，这样，两个指针总有一个是空位的
    而走到了最后，low肯定是等于high的，也就是空位，将flag填充进去，并返回这个值，表示这个值左边都大于这个值。
     */
    public static int partition(int[] nums, int low, int high) {
        int flag = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= flag) {
                high--;
            }
            if (low < high && nums[high] < flag) {
                nums[low] = nums[high];
            }
            while (low < high && nums[low] <= flag) {
                low++;
            }
            if (low < high && nums[low] > flag) {
                nums[high] = nums[low];
            }
        }
        nums[low] = flag;
        return low;
    }

    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 5;
        nums[1] = 2;
        nums[2] = 4;
        nums[3] = 1;
        nums[4] = 3;
        sortNums(nums);
        for (int i=0;i<5;i++) {
            System.out.println(nums[i]);
        }
    }
}
