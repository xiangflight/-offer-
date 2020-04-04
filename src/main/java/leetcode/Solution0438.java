package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        // 定义一个滑动窗口 [left...right]
        int left = 0, right = 0;

        int[] needFreq = new int[256];
        for (char c: p.toCharArray()) {
            needFreq[c]++;
        }
        int diff = 0;
        for (int val: needFreq) {
            if (val != 0) {
                diff++;
            }
        }

        int[] windowFreq = new int[256];
        int match = 0;

        while (right < s.length()) {
            char c1 = s.charAt(right);
            if (needFreq[c1] != 0) {
                windowFreq[c1]++;
                if (windowFreq[c1] == needFreq[c1]) {
                    match++;
                }
            }
            right++;

            while (match == diff) {
                if (right - left == p.length()) {
                    ans.add(left);
                }
                char c2 = s.charAt(left);
                if (needFreq[c2] != 0) {
                    windowFreq[c2]--;
                    if (windowFreq[c2] < needFreq[c2]) {
                        match--;
                    }
                }
                left++;
            }
        }

        return ans;
    }

}
