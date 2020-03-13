package algo.backtracking;

import java.util.LinkedList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/13
 * <p>
 * N皇后问题
 *
 * 路径
 * 选择列表
 * 结束条件
 *
 */

public class NQueens {

    List<List<Integer>> res = new LinkedList<>();

    List<List<Integer>> solveNQueens(int n) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(track, n);
        return res;
    }

    private void backtrack(LinkedList<Integer> track, int n) {
        // 结束条件
        if (track.size() == n) {
            res.add(new LinkedList<>(track));
            return;
        }
        // 选择列表
        for (int col = 0; col < n; col++) {
            track.add(col);
            if (isValid(track)) {
                backtrack(track, n);
            }
            track.removeLast();
        }
    }

    private boolean isValid(List<Integer> track) {
        int currRow = track.size() - 1;
        for (int i = 0; i < currRow; i++) {
            int diff = Math.abs(track.get(i) - track.get(currRow));
            if (diff == 0 || diff == currRow - i) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        List<List<Integer>> lists = new NQueens().solveNQueens(8);
        lists.forEach(System.out::println);

    }

}
