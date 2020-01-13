package cc189;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 */

public class Solution0812 {

    List<List<Integer>> nQueens(int n) {
        List<List<Integer>> result = new ArrayList<>();
        solveNQueens(n, 0, new ArrayList<>(), result);
        return result;
    }

    private void solveNQueens(int n, int row, ArrayList<Integer> colPlacements, List<List<Integer>> result) {
        if (row == n) {
            result.add(new ArrayList<>(colPlacements));
            return;
        }
        for (int col = 0; col < n; col++) {
            colPlacements.add(col);
            if (isValid(colPlacements)) {
                solveNQueens(n, row + 1, colPlacements, result);
            }
            colPlacements.remove(colPlacements.size() - 1);
        }
    }

    private boolean isValid(ArrayList<Integer> colPlacements) {
        int rowId = colPlacements.size() - 1;
        for (int i = 0; i < rowId; i++) {
            int diff = Math.abs(colPlacements.get(i) - colPlacements.get(rowId));
            if (diff == 0 || diff == rowId - i) {
                return false;
            }
        }
        return true;
    }

}
