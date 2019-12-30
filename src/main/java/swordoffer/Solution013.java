package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 */

public class Solution013 {

    boolean[][] visited;

    int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    int m, n;

    public int movingCount(int threshold, int rows, int cols) {
        m = rows;
        n = cols;
        visited = new boolean[m][n];
        return movingCount(threshold, rows, cols, 0, 0);
    }

    private int movingCount(int threshold, int rows, int cols, int startX, int startY) {
        if (!check(threshold, startX, startY)) {
            return 0;
        }
        int count = 1;
        visited[startX][startY] = true;
        for (int[] direction: directions) {
            int newX = startX + direction[0];
            int newY = startY + direction[1];
            count += movingCount(threshold, rows, cols, newX, newY);
        }
        return count;
    }

    public boolean check(int threshold, int startX, int startY) {
        return inArea(startX, startY) && !visited[startX][startY] && (digitSum(startX) + digitSum(startY) <= threshold);
    }

    public int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

}
