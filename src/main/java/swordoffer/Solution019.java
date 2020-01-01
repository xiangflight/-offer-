package swordoffer;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 * <p>
 * 请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
 * 在本题中，匹配是指字符串的所有字符匹配整个模式。
 * 例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */

public class Solution019 {

    int[][] memo;

    public boolean match(char[] str, char[] pattern) {
        memo = new int[str.length + 1][pattern.length + 1];
        for (int[] row: memo) {
            Arrays.fill(row, -1);
        }
        return match(str, 0, pattern, 0);
    }

    private boolean match(char[] str, int sStart, char[] pattern, int pStart) {
        if (pStart == pattern.length) {
            return sStart == str.length;
        }
        if (memo[sStart][pStart] != -1) {
            return memo[sStart][pStart] == 1;
        }
        boolean ans;
        boolean curMatch = sStart < str.length && (str[sStart] == pattern[pStart] || pattern[pStart] == '.');
        if (pStart + 1 < pattern.length && pattern[pStart + 1] == '*') {
            ans = match(str, sStart, pattern, pStart + 2) || (curMatch && match(str, sStart + 1, pattern, pStart));
        } else {
            ans = curMatch && match(str, sStart + 1, pattern, pStart + 1);
        }
        return ans;
    }
}