package leetcode;

import java.util.ArrayDeque;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/29
 */

public class Solution1162 {

    int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public int maxDistance(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    queue.offer(new int[] {i, j});
                }
            }
        }

        boolean hasOcean = false;
        int[] point = null;
        int x = -1;
        int y = -1;
        while (!queue.isEmpty()) {
            point = queue.poll();
            x = point[0];
            y = point[1];
            for (int[] direction: directions) {
                int nx = x + direction[0];
                int ny = y + direction[1];
                if (nx < 0 || nx >= m || ny < 0 || ny >= n || grid[nx][ny] != 0) {
                    continue;
                }
                grid[nx][ny] = grid[x][y] + 1;
                if (!hasOcean) {
                    hasOcean = true;
                }
                queue.offer(new int[]{nx, ny});
            }
        }
        if (point == null || !hasOcean) {
            return -1;
        }
        return grid[x][y] - 1;
    }

}
