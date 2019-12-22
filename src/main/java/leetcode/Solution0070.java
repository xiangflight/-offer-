package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

public class Solution0070 {

    public int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        int[] memo = new int[n + 1];
        memo[1] = 1;
        memo[2] = 2;
        for (int i = 3; i <= n; i++) {
            memo[i] = memo[i-1] + memo[i-2];
        }
        return memo[n];
    }

    public int  climbStairsRecursive(int n) {
        return calcWays(n);
    }

    private int calcWays(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return calcWays(n - 1) + calcWays(n - 2);
    }

}
