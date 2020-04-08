package leetcode.dp;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/8
 */

public class Solution0010 {

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        int[][] memo = new int[m + 1][n + 1];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return isMatch(s, p, 0, 0, memo);
    }

    private boolean isMatch(String s, String p, int i, int j, int[][] memo) {
        if (memo[i][j] != -1) {
            return memo[i][j] == 1;
        }
        if (j == p.length()) {
            return i == s.length();
        }
        boolean firstMatch = i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.');

        boolean ans = false;
        if (j < p.length() - 1 && p.charAt(j + 1) == '*') {
            ans = isMatch(s, p, i, j + 2, memo) || (firstMatch && isMatch(s, p, i + 1, j, memo));
        } else {
            ans = firstMatch && isMatch(s, p, i + 1, j + 1, memo);
        }
        memo[i][j] = ans ? 1: 0;
        return ans;
    }

}
