package leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/28
 */

public class Solution0994 {


    int m, n;

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        m = grid.length;
        n = grid[0].length;
        Queue<int[]> queue = new ArrayDeque<>();

        int fresh = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    fresh++;
                }
            }
        }
        if (fresh == 0) {
            return 0;
        }

        int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
        int minutes = -1;

        while (!queue.isEmpty()) {
            minutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rotten = queue.poll();
                for (int[] dir : directions) {
                    int nx = rotten[0] + dir[0];
                    int ny = rotten[1] + dir[1];
                    if (inArea(nx, ny) && grid[nx][ny] == 1) {
                        grid[nx][ny] = 2;
                        queue.offer(new int[]{nx, ny});
                        fresh--;
                    }
                }
            }
        }
        return fresh == 0 ? minutes : -1;
    }

    private boolean inArea(int x, int y) {
        return (x >= 0 && x < m) && (y >= 0 && y < n);
    }

}
