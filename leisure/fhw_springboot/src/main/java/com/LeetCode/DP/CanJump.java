package com.LeetCode.DP;

import java.util.Arrays;
import java.util.HashMap;

public class CanJump {
    public static boolean canJump(int[] nums) {
        if (nums.length < 2) {
            return true;
        }
        boolean[] dp = new boolean[nums.length];
        dp[nums.length-1] = true;
        for (int i = nums.length-2; i>=0; i--) {
            for (int j=i+1; j<=i+nums[i] && j<nums.length; j++) {
                if (dp[j]) {
                    dp[i] = true;
                    break;
                }
            }
        }
        HashMap hashMap = new HashMap();

        System.out.println(Arrays.toString(dp));
        return dp[0];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,0,4};
        boolean ans = canJump(nums);
        System.out.println(ans);
    }
}
