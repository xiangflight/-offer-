package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0438 {

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int[] freq = new int[26];
        for (char c: p.toCharArray()) {
            freq[c - 'a']++;
        }
        int[] another = new int[26];
        // define a sliding window
        int l = 0, r = -1;
        while (r + 1 < s.length()) {
            r++;
            another[s.charAt(r) - 'a']++;
            if (r - l + 1 > p.length()) {
                another[s.charAt(l) - 'a']--;
                l++;
            }
            if (r - l + 1 == p.length() && isSame(freq, another)) {
                res.add(l);
            }
        }
        return res;
    }

    private boolean isSame(int[] freq, int[] another) {
        for (int i = 0; i < 26; i++) {
            if (freq[i] != another[i]) {
                return false;
            }
        }
        return true;
    }

}
