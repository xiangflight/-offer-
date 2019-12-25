package algo.dp;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 */

public class LongestCommonSequence {

    int[][] memo;

    public int longestCommonSubsequence(String text1, String text2) {
        assert text1 != null && text2 != null;
        memo = new int[text1.length() + 1][text2.length() + 1];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return longestCommonSubsequence(text1, text1.length() - 1, text2, text2.length() - 1);
    }

    /**
     * 求得 text1[0...m] 和 text2[0...n] 中最长公共子序列
     * @param text1 text1
     * @param m m
     * @param text2 text2
     * @param n n
     * @return 结果
     */
    private int longestCommonSubsequence(String text1, int m, String text2, int n) {
        if (m < 0 || n < 0) {
            return 0;
        }
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        if (text1.charAt(m) == text2.charAt(n)) {
            memo[m][n] = longestCommonSubsequence(text1, m - 1, text2, n - 1) + 1;
            return memo[m][n];
        }
        memo[m][n] =  Math.max(longestCommonSubsequence(text1, m, text2, n - 1), longestCommonSubsequence(text1, m - 1, text2, n));
        return memo[m][n];
    }

    public static void main(String[] args) {
        LongestCommonSequence lcs = new LongestCommonSequence();
        String s1 = "ABCD";
        String s2 = "AEBD";
        int res = lcs.longestCommonSubsequence(s1, s2);
        System.out.println(res);
        s1 = "abcde";
        s2 = "ace";
        res = lcs.longestCommonSubsequence(s1, s2);
        System.out.println(res);
        s1 = "abc";
        s2 = "abc";
        res = lcs.longestCommonSubsequence(s1, s2);
        System.out.println(res);
        s1 = "abc";
        s2 = "def";
        System.out.println(lcs.longestCommonSubsequence(s1, s2));
    }

}
