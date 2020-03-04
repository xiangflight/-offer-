package leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/28
 * <p>
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 * <p>
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 * <p>
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 */

public class Solution0994 {

    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int row = grid.length;
        int col = grid[0].length;

        // 新鲜橘子的数量
        int freshCount = 0;

        Deque<Orange> rottenOranges = new ArrayDeque<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                }
                if (grid[i][j] == 2) {
                    rottenOranges.offer(new Orange(i, j, grid, 0));
                }
            }
        }
        // 如果没有新鲜的橘子
        if (freshCount == 0) {
            return 0;
        }
        // 四个方向
        int[][] directions = {{0, -1}, {1, 0}, {0, 1}, {-1, 0}};
        // 最小分钟数
        int minutes = 0;

        while (!rottenOranges.isEmpty()) {
            int size = rottenOranges.size();
            for (int i = 0; i < size; i++) {
                Orange rottenOrange = rottenOranges.poll();
                for (int[] direction : directions) {
                    int newX = rottenOrange.x + direction[0];
                    int newY = rottenOrange.y + direction[1];
                    Orange newOrange = new Orange(newX, newY, grid, rottenOrange.minutes + 1);
                    if (newOrange.isValid()) {
                        newOrange.setRotten();
                        rottenOranges.offer(newOrange);
                        freshCount--;
                    }
                }
                minutes = Math.max(minutes, rottenOrange.minutes);
            }
        }
        // 如果还有新鲜的橘子，就不可能
        return freshCount != 0 ? -1 : minutes;
    }

    /**
     * 橘子
     */
    static class Orange {

        int x;
        int y;
        int[][] grid;
        int minutes;

        Orange(int x, int y, int[][] grid, int minutes) {
            this.x = x;
            this.y = y;
            this.grid = grid;
            this.minutes = minutes;
        }

        boolean isFresh() {
            return grid[x][y] == 1;
        }

        boolean isInArea() {
            return (x >= 0 && x < grid.length) && (y >= 0 && y < grid[0].length);
        }

        void setRotten() {
            grid[x][y] = 2;
        }

        boolean isValid() {
            return isInArea() && isFresh();
        }
    }

}
