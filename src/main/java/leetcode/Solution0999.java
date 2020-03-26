package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/26
 */

public class Solution0999 {

    public int numRookCaptures(char[][] board) {
         int[][] directions = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
         int len = board.length;
         int x = 0, y = 0;
         for (int i = 0; i < len; i++) {
             for (int j = 0; j < len; j++) {
                 if (board[i][j] == 'R') {
                     x = i;
                     y = j;
                 }
             }
         }

         int res = 0;

         for (int[] direction: directions) {
             if (valid(board, x, y, direction)) {
                 res++;
             }
         }

         return res;
    }

    private boolean valid(char[][] board, int i, int j, int[] direction) {
        int curX = i;
        int curY = j;
        while (inArea(curX, curY)) {
            if (board[curX][curY] == 'B') {
                break;
            }
            if (board[curX][curY] == 'p') {
                return true;
            }
            curX += direction[0];
            curY += direction[1];
        }
        return false;
    }

    private boolean inArea(int i, int j) {
        return i >= 0 && i < 8 && j >= 0 && j < 8;
    }

}
