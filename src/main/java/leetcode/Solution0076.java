package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0076 {

    public String minWindow(String s, String t) {
        int start = 0, minLen = Integer.MAX_VALUE;
        // define a sliding window [left...right]
        int left = 0, right = 0;
        int[] tFreq = new int[256];
        for (char c : t.toCharArray()) {
            tFreq[c]++;
        }
        int diff = 0;
        for (int val: tFreq) {
            if (val != 0) {
                diff++;
            }
        }

        int[] windowFreq = new int[256];

        int match = 0;

        while (right < s.length()) {
            char c1 = s.charAt(right);

            if (tFreq[c1] != 0) {
                windowFreq[c1]++;
                if (windowFreq[c1] == tFreq[c1]) {
                    match++;
                }
            }
            right++;

            while (match == diff) {
                if (right - left < minLen) {
                    start = left;
                    minLen = right - left;
                }
                char c2 = s.charAt(left);
                if (tFreq[c2] != 0) {
                    windowFreq[c2]--;
                    if (windowFreq[c2] < tFreq[c2]) {
                        match--;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "": s.substring(start, start + minLen);
    }
}
