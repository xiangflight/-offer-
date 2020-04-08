package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution0005 {

    int start, maxLen;

    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            expandFromMiddle(s, i, i);
            expandFromMiddle(s, i, i + 1);
        }
        return s.substring(start, start + maxLen);
    }

    public void expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) {
            return;
        }
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLen < right - left - 1) {
            start = left + 1;
            maxLen = right - left - 1;
        }
    }

    public String longestPalindrome1(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        int n = s.length();
        if (n == 1) {
            return s;
        }
        int start = 0;
        int maxLen = 1;
        boolean[][] memo = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            memo[i][i] = true;
            if (i < n - 1 && s.charAt(i) == s.charAt(i + 1)) {
                memo[i][i + 1] = true;
                maxLen = 2;
                start = i;
            }
        }
        // l 为检索的字段长度
        for (int l = 3; l <= n; l++) {
            for (int i = 0; i + l - 1 < n; i++) {
                int j = i + l - 1;
                if (s.charAt(i) == s.charAt(j) && memo[i+1][j-1]) {
                    memo[i][j] = true;
                    start = i;
                    maxLen = l;
                }
            }
        }
        return s.substring(start, start + maxLen);
    }

    int longestPalindromeLen(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = 1;
        }
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i + 1; j < n; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    dp[i][j] = dp[i + 1][j - 1] + 2;
                } else {
                    dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[0][n - 1];
    }

}
