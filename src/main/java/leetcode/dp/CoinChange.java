package leetcode.dp;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/8
 *
 * 明确状态 -> 定义 dp数组/函数的含义 -> 明确选择并择优 -> 明确 base case
 */

public class CoinChange {

    /**
     *
     * dp[i] = x 的含义是 当 amount = i 时所需的最小硬币数
     *
     * @param coins coins
     * @param amount amount
     * @return 最少硬币数凑成 amount
     */
    int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        // base case
        dp[0] = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int coin: coins) {
                if (i < coin) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1: dp[amount];
    }

}
