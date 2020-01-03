package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
 * 例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。
 */

public class Solution048 {

    public static void main(String[] args) {
        String s = "acfr";
        int ans = new Solution048().longestSubStringWithoutDuplication(s);
        System.out.println(ans);
    }

    public int longestSubStringWithoutDuplication(String str) {
        if (str == null || str.length() == 0) {
            {
                return 0;
            }
        }
        char[] arr = str.toCharArray();
        int[] freq = new int[256];
        // define a sliding window [l..r]
        int l = 0, r = -1;
        int n = str.length();

        int res = 0;
        while (r + 1 < n) {
            if (freq[arr[r + 1]] == 0) {
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
