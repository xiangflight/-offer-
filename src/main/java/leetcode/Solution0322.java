package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 * <p>
 * dp[i] = x 表示，当目标金额为 i 时，至少需要 x 枚硬币
 */

public class Solution0322 {

    public int coinChange(int[] coins, int amount) {
        int[] memo = new int[amount + 1];
        Arrays.fill(memo, -1);
        return coinChange(coins, amount, memo);
    }

    private int coinChange(int[] coins, int amount, int[] memo) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return -1;
        }
        if (memo[amount] != -1) {
            return memo[amount];
        }
        int res = Integer.MAX_VALUE;
        for (int coin: coins) {
            int subCoinChange = coinChange(coins, amount - coin, memo);
            if (subCoinChange == -1) {
                continue;
            }
            res = Math.min(res, subCoinChange + 1);
        }
        memo[amount] = res;
        return res == Integer.MAX_VALUE ? -1: res;
    }

    public int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin: coins) {
                if (i - coin < 0) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1: dp[amount];
    }

}
