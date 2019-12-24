package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

public class Solution0343 {

    public int integerBreak(int n) {
        return breakInteger(n);
    }

    /**
     * 将 n 进行分割，求得最大的乘积
     * @param n n
     * @return res
     */
    private int breakInteger(int n) {
        int[] memo = new int[n + 1];
        if (n == 1) {
            return 1;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        int res = -1;
        for (int i = 1; i <= n - 1; i++) {
            res = Math.max(res, Math.max(i * (n - i), i * breakInteger(n - i)));
        }
        memo[n] = res;
        return res;
    }

    public int integerBreakDp(int n) {
        assert n >= 2;

        // memo[i] 表示将数字 i 分割（至少分割成两部分）后得到的最大乘积
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        memo[1] = 1;
        for (int i = 2; i <= n;  i++) {
            // 求解memo[i]
            for (int j = 1; j <= i - 1; j++) {
                memo[i] = Math.max(memo[i], Math.max(j * (i - j), j * memo[i - j]));
            }
        }
        return memo[n];
    }

}
