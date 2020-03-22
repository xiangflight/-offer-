package interview.bytedance;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/22
 */

public class Solution0001 {

    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int l = 0, r = -1;
        int res = 0;
        int[] freq = new int[256];

        while (l < s.length()) {
            if (r + 1 < s.length() && freq[s.charAt(r + 1)] == 0) {
                r++;
                freq[s.charAt(r)]++;
            } else {
                freq[s.charAt(l)]--;
                l++;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }

}
