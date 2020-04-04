package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0003 {

    public int lengthOfLongestSubstring(String s) {
        // 定义一个滑动窗口
        int left = 0, right = 0;
        int[] window = new int[256];
        int res = 0;

        while (right < s.length()) {
            char c1 = s.charAt(right);
            window[c1]++;
            right++;
            while (window[c1] > 1) {
                char c2 = s.charAt(left);
                window[c2]--;
                left++;
            }
            res = Math.max(res, right - left);
        }
        return res;
    }

}