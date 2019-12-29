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
        while (left >= 0 && right < s.length(  ) && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLen < right - left - 1) {
            start = left + 1;
            maxLen = right - left - 1;
        }
    }

}
