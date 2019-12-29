package leetcode;

import java.util.HashSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution0036 {

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char curVal = board[i][j];
                if (curVal != '.') {
                    if (!seen.add(curVal + " found in row " + i)
                            || !seen.add(curVal + " found in column " + j)
                            || !seen.add(curVal + " found in subbox " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}
