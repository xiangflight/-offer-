package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/22
 */

public class Solution0062 {

    public int uniquePathsOrdinal(int m, int n) {
        return pathsOrdinal(m - 1, n - 1);
    }

    private int pathsOrdinal(int i, int j) {
        if (i == 0 || j == 0) {
            return 1;
        }
        return pathsOrdinal(i - 1, j) + pathsOrdinal(i, j - 1);
    }

    int[][] memo;

    public int uniquePathsMemoized(int m, int n) {
        memo = new int[m][n];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return paths(m - 1, n - 1);
    }

    private int paths(int i, int j) {
        if (i == 0 || j == 0) {
            return 1;
        }
        if (memo[i][j] != -1) {
            return memo[i][j];
        }
        memo[i][j] = paths(i - 1, j) + paths(i, j - 1);
        return memo[i][j];
    }

    public int uniquePaths(int m, int n) {
        int[][] memo = new int[m][n];
        for (int j = 0; j < n; j++) {
            memo[0][j] = 1;
        }
        for (int i = 0; i < m; i++) {
            memo[i][0] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                memo[i][j] = memo[i - 1][j] + memo[i][j - 1];
            }
        }
        return memo[m - 1][n - 1];
    }

    public int uniquePathsMemoryPerf(int m, int n) {
        int[] cur = new int[n];
        Arrays.fill(cur, 1);
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                cur[j] += cur[j - 1];
            }
        }
        return cur[n - 1];
    }
}
