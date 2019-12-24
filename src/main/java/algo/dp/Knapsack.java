package algo.dp;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/24
 * <p>
 * 递归 -> 记忆化搜索 -> 动态规划
 */

public class Knapsack {

    int[][] memo;

    public static void main(String[] args) {
        int[] w = {1, 2, 3};
        int[] v = {6, 10, 12};
        int c = 5;
        int res = new Knapsack().knapsackDp(w, v, c);
        System.out.println(res);
    }

    int knapsack(int[] w, int[] v, int c) {
        int n = w.length;
        memo = new int[n][c + 1];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return bestValue(w, v, n - 1, c);
    }

    /**
     * 用[0..index]中的物品，填充容积为 c 的背包的最大价值
     * <p>
     * 记忆话搜索
     *
     * @param w     w
     * @param v     v
     * @param index index
     * @param c     c
     * @return 最大价值
     */
    private int bestValue(int[] w, int[] v, int index, int c) {
        if (index < 0 || c <= 0) {
            return 0;
        }
        if (memo[index][c] != -1) {
            return memo[index][c];
        }
        int res = bestValue(w, v, index - 1, c);
        if (c >= w[index]) {
            res = Math.max(res, v[index] + bestValue(w, v, index - 1, c - w[index]));
        }
        memo[index][c] = res;
        return res;
    }

    int knapsackDp(int[] w, int[] v, int c) {
        assert w.length == v.length;
        int n = w.length;
        if (n == 0) {
            return 0;
        }
        int[] memo = new int[c + 1];
        Arrays.fill(memo, -1);
        for (int j = 0; j <= c; j++) {
            memo[j] = (j >= w[0] ? v[0] : 0);
        }
        for (int i = 1; i < n; i++) {
            for (int j = c; j >= w[i]; j--) {
                memo[j] = Math.max(memo[j], v[i] + memo[j - w[i]]);
            }
        }
        return memo[c];
    }
}
