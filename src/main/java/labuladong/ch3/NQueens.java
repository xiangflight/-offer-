package labuladong.ch3;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/9
 */

public class NQueens {

    List<List<Integer>> res = new LinkedList<>();

    List<List<Integer>> solveNQueens(int n) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(track, n);
        return res;
    }

    private void backtrack(LinkedList<Integer> track, int n) {
        if (track.size() == n) {
            res.add(new LinkedList<>(track));
            return;
        }

        for (int col = 0; col < n; col++) {
            track.add(col);
            if (isValid(track)) {
                backtrack(track, n);
            }
            track.removeLast();
        }
    }

    private boolean isValid(LinkedList<Integer> track) {
        int currRow = track.size() - 1;
        for (int i = 0; i < currRow; i++) {
            int diff = Math.abs(track.get(i) - track.get(currRow));
            if (diff == 0 || diff == currRow - i) {
                return false;
            }
        }
        return true;
    }

}
