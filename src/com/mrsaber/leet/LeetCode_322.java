package com.mrsaber.leet;

import java.util.Arrays;

/**
 * 零钱兑换
 */
public class LeetCode_322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp, -1);
        for(int i = 0 ;i < coins.length;i++){
            dp[0] = 0;
        }
        for(int i = 1;i <= amount;i++){
            for(int j = 0; j < coins.length ;j++){
                if(i-coins[j] >= 0 && dp[i-coins[j]]!=-1){
                    if(dp[i] == -1){
                        dp[i] = dp[i-coins[j]] + 1;
                    }else{
                        dp[i] = Math.min(dp[i],dp[i-coins[j]] + 1);
                    }
                }
            }
        }
        return dp[amount];
    }
}
