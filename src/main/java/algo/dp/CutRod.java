package algo.dp;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/6
 */

public class CutRod {

    public static void main(String[] args) {
        int n = 7;
        int[] p = {0, 1 ,5, 8, 9, 10, 17, 17, 20, 24, 30};
        int ans = new CutRod().extendedBottomUpCutRod(p, n);
    }

    private int cutRod(int[] p, int n) {
        if (n == 0) {
            return 0;
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            maxProfit = Math.max(maxProfit, p[i] + cutRod(p, n - i));
        }
        return maxProfit;
    }

    private int memoizedCutRod(int[] p, int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return memoizedCutRodAux(p, n, memo);
    }

    private int memoizedCutRodAux(int[] p, int n, int[] memo) {
        if (n == 0) {
            return 0;
        }
        if (memo[n] != -1) {
            return memo[n];
        }
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            maxProfit = Math.max(maxProfit, p[i] + memoizedCutRodAux(p, n - i, memo));
        }
        memo[n] = maxProfit;
        return maxProfit;
    }

    private int bottomUpCutRod(int[] p, int n) {
        int[] memo = new int[n + 1];
        memo[0] = 0;
        for (int j = 1; j <= n; j++) {
            int maxProfit = Integer.MIN_VALUE;
            for (int i = 1; i <= j; i++) {
                maxProfit = Math.max(maxProfit, p[i] + memo[j - i]);
            }
            memo[j] = maxProfit;
        }
        return memo[n];
    }

    int[] s;

    private int extendedBottomUpCutRod(int[] p, int n) {
        int[] memo = new int[n + 1];
        s = new int[n + 1];
        memo[0] = 0;
        for (int j = 1; j <= n; j++) {
            int maxProfit = Integer.MIN_VALUE;
            for (int i = 1; i <= j; i++) {
                if (maxProfit < p[i] + memo[j - i]) {
                    maxProfit = p[i] + memo[j - i];
                    s[j] = i;
                }
                memo[j] = maxProfit;
            }
        }
        while (n > 0) {
            System.out.println(s[n]);
            n = n - s[n];
        }
        return memo[n];
    }

}
