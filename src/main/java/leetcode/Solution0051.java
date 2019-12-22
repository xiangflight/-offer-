package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0051 {

    List<List<String>> res = new ArrayList<>();
    boolean[] col;
    boolean[] dia1, dia2;

    public List<List<String>> solveNQueens(int n) {
        res.clear();
        col = new boolean[n];
        dia1 = new boolean[2 * n - 1];
        dia2 = new boolean[2 * n - 1];
        putQueen(n, 0, new ArrayList<>());
        return res;
    }

    /**
     * 尝试在一个 N 皇后问题中，摆放第 pos 行的皇后位置
     *
     * @param n   n
     * @param pos pos
     * @param row row
     */
    private void putQueen(int n, int pos, List<Integer> row) {
        if (pos == n) {
            res.add(generateBoard(n, row));
            return;
        }
        for (int i = 0; i < n; i++) {
            // 尝试将第 pos 行的皇后放在第 i 列
            if (!col[i] && !dia1[pos + i] && !dia2[pos - i + n - 1]) {
                row.add(i);
                col[i] = true;
                dia1[pos + i] = true;
                dia2[pos - i + n - 1] = true;
                putQueen(n, pos + 1, row);
                col[i] = false;
                dia2[pos - i + n - 1] = false;
                dia1[pos + i] = false;
                row.remove(row.size() - 1);
            }
        }
    }

    private List<String> generateBoard(int n, List<Integer> row) {
        assert row.size() == n;
        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (j == row.get(i)) {
                    sb.append("Q");
                } else {
                    sb.append(".");
                }
            }
            board.add(sb.toString());
        }
        return board;
    }
}
