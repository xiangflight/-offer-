package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0003 {

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int[] freq = new int[256];
        int l = 0, r = -1;
        int res = 0;
        while (l < arr.length) {
            if (r + 1 < arr.length && freq[arr[r + 1]] == 0) {
                r++;
                freq[arr[r]]++;
            } else {
                freq[arr[l]]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
