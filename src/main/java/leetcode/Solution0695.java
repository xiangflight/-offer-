package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/15
 */

public class Solution0695 {

    int[][] d = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public int maxAreaOfIsland(int[][] grid) {
        if (grid == null) {
            return 0;
        }
        int maxArea = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, grid));
                }
            }
        }
        return maxArea;
    }

    private int dfs(int x, int y, int[][] grid) {
        if (inValid(x, y, grid)) {
            return 0;
        }
        grid[x][y] = 0;
        int num = 1;
        for (int[] direction : d) {
            num += dfs(x + direction[0], y + direction[1], grid);
        }
        return num;
    }

    boolean inValid(int x, int y, int[][] grid) {
        if (x < 0 || y < 0) {
            return true;
        }
        if (x >= grid.length || y >= grid[0].length) {
            return true;
        }
        return grid[x][y] == 0;
    }

}
