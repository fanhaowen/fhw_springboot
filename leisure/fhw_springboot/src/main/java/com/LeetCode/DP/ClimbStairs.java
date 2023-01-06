package com.LeetCode.DP;

public class ClimbStairs {
    /** Easy
     * 爬楼梯是最简单的dp
     */
    public static void main(String[] args) {
        int n = 10;
        int ans = solution(n);
        System.out.println(ans);
    }

    public static int solution(int n) {
        if (n < 2) {
            return n;
        }
        //dp[n] 代表上第n-1阶台阶可以的办法
        int[] dp = new int[n];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i<n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n-1];
    }
}
