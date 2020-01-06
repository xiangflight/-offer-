package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 */

public class Solution0010 {


    public boolean isMatch(String s, String p) {
        boolean[][] memo = new boolean[s.length() + 1][p.length() + 1];
        memo[s.length()][p.length()] = true;

        for (int i = s.length(); i >= 0; i--) {
            for (int j = p.length() - 1; j >= 0; j--) {
                boolean firstMatch = (i < s.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '.'));
                if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
                    memo[i][j] = memo[i][j + 2] || (firstMatch && memo[i + 1][j]);
                } else {
                    memo[i][j] = firstMatch && memo[i + 1][j + 1];
                }
            }
        }
        return memo[0][0];
    }

}
