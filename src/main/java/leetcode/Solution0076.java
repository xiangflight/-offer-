package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0076 {

    public String minWindow(String s, String t) {
        int[] tFreq = new int[256];
        for (char c: t.toCharArray()) {
            tFreq[c]++;
        }
        int[] sFreq = new int[256];
        int count = 0;

        int start = -1;
        int min = s.length() + 1;

        int l = 0, r = -1;
        while (l < s.length()) {
            if (r + 1 < s.length() && count < t.length()) {
                r++;
                sFreq[s.charAt(r)]++;
                if (sFreq[s.charAt(r)] <= tFreq[s.charAt(r)]) {
                    count++;
                }
            } else {
                if (count == t.length() && r - l + 1 < min) {
                    min = r - l + 1;
                    start = l;
                }
                sFreq[s.charAt(l)]--;
                if (sFreq[s.charAt(l)] < tFreq[s.charAt(l)]) {
                    count--;
                }
                l++;
            }
        }
        return -1 == start ? "": s.substring(start, start + min);
    }
}
