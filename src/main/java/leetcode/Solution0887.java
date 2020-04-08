package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 *
 * dp[i][j] = x，表示当前有 i 个鸡蛋，面对楼层是 j，最差情况下，所需要移动的最小次数
 */

public class Solution0887 {

    public int superEggDrop(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        // base case
        // 当楼层 N = 0 时
        for (int i = 1; i <= K; i++) {
            dp[i][0] = 0;
        }
        // 当鸡蛋个数为1时，只能移动楼层的次数
        for (int j = 1; j <= N; j++) {
            dp[1][j] = j;
        }
        // 更新 dp 表
        for (int i = 2; i <= K; i++) {
            for (int j = 1; j <= N; j++) {
                int res = Integer.MAX_VALUE;
                for (int k = 1; k <= j; k++) {
                    res = Math.min(res, Math.max(dp[i - 1][k - 1], dp[i][j - k]) + 1);
                }
                dp[i][j] = res;
            }
        }

        return dp[K][N];
    }

    public int superEggDrop2(int K, int N) {
        int[][] dp = new int[K + 1][N + 1];
        int m = 0;
        while (dp[K][m] < N) {
            m++;
            for (int k = 1; k <= K; k++) {
                dp[k][m] = dp[k][m - 1] + dp[k - 1][m - 1] + 1;
            }
        }
        return m;
    }

}
