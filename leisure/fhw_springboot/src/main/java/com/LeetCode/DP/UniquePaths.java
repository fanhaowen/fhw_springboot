package com.LeetCode.DP;

import java.util.Arrays;

public class UniquePaths {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        //dp[i][j]代表该节点有多少办法到达
        //让指针从左往右，到头后换行走就可以
        dp[0][0] = 1;
        for(int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    dp[i][j] = dp[i][j-1];
                    continue;
                }
                if (j == 0) {
                    dp[i][j] = dp[i-1][j];
                    continue;
                }
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        for (int i = 0; i< m;i++) {
            System.out.println(Arrays.toString(dp[i]));
        }
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        int ans = uniquePaths(7, 3);
        System.out.println(ans);
    }
}
