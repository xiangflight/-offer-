package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/19
 */

public class Solution0022 {

    public static void main(String[] args) {
        List<String> ans = new Solution0022().generateParenthesis(2);
        System.out.println(ans);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        if (n == 0) {
            return ans;
        }
        StringBuilder track = new StringBuilder();
        backtrack(n, n, track, ans);
        return ans;
    }

    private void backtrack(int left, int right, StringBuilder track, List<String> ans) {
        if (left > right) {
            return;
        }
        if (left < 0) {
            return;
        }
        if (left == 0 && right == 0) {
            ans.add(track.toString());
            return;
        }
        track.append("(");
        backtrack(left - 1, right, track, ans);
        track.deleteCharAt(track.length() - 1);

        track.append(")");
        backtrack(left, right - 1, track, ans);
        track.deleteCharAt(track.length() - 1);

    }

}
