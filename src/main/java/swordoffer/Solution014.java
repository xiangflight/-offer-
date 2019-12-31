package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 * <p>
 * 递归 -> 记忆化搜索 -> 动态规划
 */

public class Solution014 {

    public int cutRope(int target) {
        int[] dp = new int[target + 1];
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                // j 和 (i-j)
                dp[i] = max3(dp[i], j * (i - j), j * dp[i - j]);
            }
        }
        return dp[target];
    }

    public int max3(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public int cutRope2(int target) {
        if (target < 2) {
            return 0;
        }
        if (target == 2) {
            return 1;
        }
        if (target == 3) {
            return 2;
        }
        int timesOf3 = target / 3;
        if (target - timesOf3 * 3 == 1) {
            timesOf3--;
        }
        int timesOf2 = (target - timesOf3 * 3) / 2;
        return (int) (Math.pow(3, timesOf3)) * (int) (Math.pow(2, timesOf2));
    }

}
