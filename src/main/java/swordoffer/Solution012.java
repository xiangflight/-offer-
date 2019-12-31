package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 */

public class Solution012 {

    int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    boolean[][] visited;

    int m, n;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        m = rows;
        n = cols;
        visited = new boolean[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (findPath(matrix, rows, cols, i, j, 0, str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean findPath(char[] matrix, int rows, int cols, int startX, int startY, int index, char[] str) {
        if (index == str.length - 1) {
            return str[index] == matrix[startX * cols + startY];
        }
        if (str[index] != matrix[startX * cols + startY]) {
            return false;
        }
        visited[startX][startY] = true;

        for (int[] direction : directions) {
            int newX = startX + direction[0];
            int newY = startY + direction[1];
            if (inArea(newX, newY) && !visited[newX][newY] && findPath(matrix, rows, cols, newX, newY, index + 1, str)) {
                return true;
            }
        }
        visited[startX][startY] = false;
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

}
