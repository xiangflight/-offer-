package interview.geektime.stackandqueue;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/4/19
 */

public class Solution2 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] freq = new int[256];
        for (char c: s.toCharArray()) {
            freq[c]++;
        }
        for (char c: t.toCharArray()) {
            if (freq[c] == 0) {
                return false;
            }
            freq[c]--;
        }
        return true;
    }

}
