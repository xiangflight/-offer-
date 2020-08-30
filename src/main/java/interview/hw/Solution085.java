package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/27
 */

public class Solution085 {

    int maxLen;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int len = new Solution085().longestPalindrome(str);
            System.out.println(len);
        }
        sc.close();
    }

    private int longestPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            expandFromMiddle(s, i, i);
            expandFromMiddle(s, i, i + 1);
        }
        return maxLen;
    }

    private void expandFromMiddle(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if (maxLen < right - left - 1) {
            maxLen = right - left - 1;
        }
    }

}
