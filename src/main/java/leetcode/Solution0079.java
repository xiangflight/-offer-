package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0079 {

    int[][] direction = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int m, n;
    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        assert m > 0;
        n = board[0].length;
        visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (searchWord(board, word, 0, i, j)) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 从 board[startX][startY] 开始，寻找 word[index...word.size]
     *
     * @param board board
     * @param word word
     * @param pos position
     * @param startX startX
     * @param startY startY
     */
    private boolean searchWord(char[][] board, String word, int pos, int startX, int startY) {
        if (pos == word.length() - 1) {
            return board[startX][startY] == word.charAt(pos);
        }
        if (board[startX][startY] == word.charAt(pos)) {
            visited[startX][startY] = true;
            for (int i = 0; i < 4; i++) {
                int newX = startX + direction[i][0];
                int newY = startY + direction[i][1];
                if (inArea(newX, newY) && !visited[newX][newY] && searchWord(board, word, pos + 1, newX, newY)) {
                    return true;
                }
            }
            visited[startX][startY] = false;
        }
        return false;
    }

    private boolean inArea(int x, int y) {
        return x >= 0 && x < m && y >= 0 && y < n;
    }

}
