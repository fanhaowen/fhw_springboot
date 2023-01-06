package com.LeetCode.DP;

public class StockSellerII {

    public static int maxProfit(int[] prices) {
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];
        System.out.println("第" + 1 + "天不持有股票可以获得的最大金额：" + dp[0][0]);
        System.out.println("第" + 1 + "天持有股票可以获得的最大金额：" + dp[0][1]);
        for (int i = 1; i < n; ++i) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
            System.out.println("第" + (i + 1) + "天不持有股票可以获得的最大金额：" + dp[i][0]);
            System.out.println("第" + (i + 1) + "天持有股票可以获得的最大金额：" + dp[i][1]);
        }
        return dp[n - 1][0];
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,2,6,6,6,7};
        maxProfit(prices);
    }
}
