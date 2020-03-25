package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/25
 *
 * 在 N * N 的网格上，我们放置一些 1 * 1 * 1  的立方体。
 *
 * 每个值 v = grid[i][j] 表示 v 个正方体叠放在对应单元格 (i, j) 上。
 *
 * 请你返回最终形体的表面积。
 *
 */

public class Solution0892 {

    public int surfaceArea(int[][] grid) {
        int n = grid.length, area = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int level = grid[i][j];
                if (level > 0) {
                    area += 4 * level + 2;
                    if (i > 0) {
                        area -= Math.min(level, grid[i-1][j]) * 2;
                    }
                    if (j > 0) {
                        area -= Math.min(level, grid[i][j -1]) * 2;
                    }
                }
            }
        }
        return area;
    }
}
