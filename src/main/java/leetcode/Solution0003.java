package leetcode;

import java.util.HashSet;
import java.util.Set;

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

    public int lengthOfLongestSubstring1(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int ans = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j));
                j++;
                ans = Math.max(ans, j - i);
            } else {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return ans;
    }
}