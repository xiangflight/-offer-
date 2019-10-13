package com.xiangflight.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/13 8:45 上午
 *
 * 字符串之间字符的交集
 */

public class Solution1002 {

    public List<String> commonChars(String[] A) {
        int[] counter = new int[26];
        int len = counter.length;
        Arrays.fill(counter, 101);
        for (String str: A) {
            int[] count = new int[26];
            for (char c: str.toCharArray()) {
                count[c - 'a']++;
            }
            for (int i = 0; i < len; i++) {
                counter[i] = Math.min(count[i], counter[i]);
            }
        }
        List<String> ret = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            while (counter[i]-- > 0) {
                ret.add(String.valueOf((char)(i + 'a')));
            }
        }
        return ret;
    }

}
