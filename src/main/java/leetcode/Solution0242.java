package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0242 {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int[] fre = new int[26];
        for (char c: s.toCharArray()) {
            fre[c - 'a']++;
        }
        for (char c: t.toCharArray()) {
            if (fre[c - 'a'] == 0) {
                return false;
            }
            fre[c - 'a']--;
        }
        return true;
    }

}
