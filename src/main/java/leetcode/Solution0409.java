package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/19
 *
 * 输入:
 * "abccccdd"
 *
 * 输出:
 * 7
 *
 * 解释:
 * 我们可以构造的最长的回文串是"dccaccd", 它的长度是 7。
 */

public class Solution0409 {

    public int longestPalindrome(String s) {
        Map<Character, Integer> counter = new HashMap<>(52);
        for (char c: s.toCharArray()) {
            counter.put(c, counter.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        boolean allEven = true;
        for (int count : counter.values()) {
            if (count % 2 == 0) {
                res += count;
            } else {
                res += count - 1;
                allEven = false;
            }
        }
        return allEven ? res: res + 1;
    }

}
