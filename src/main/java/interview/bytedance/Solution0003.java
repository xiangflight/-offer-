package interview.bytedance;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/22
 */

public class Solution0003 {

    public boolean checkInclusion(String s1, String s2) {
        int len1 = s1.length(), len2 = s2.length();
        if (len1 > len2) {
            return false;
        }

        int[] freq = new int[26];
        for (int i = 0; i < len1; i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < len2; i++) {
            freq[s2.charAt(i) - 'a']--;
            if (i - len1 >= 0) {
                freq[s2.charAt(i - len1) - 'a']++;
            }
            System.out.println(Arrays.toString(freq));
            System.out.println();
            if (allZeros(freq)) {
                return true;
            }
        }

        return false;
    }

    boolean allZeros(int[] freq) {
        for (int value : freq) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        boolean res = new Solution0003().checkInclusion("ab", "eidbaooo");
        System.out.println(res);
    }

}
