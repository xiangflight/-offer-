package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/17
 *
 * 给你一份『词汇表』（字符串数组） words 和一张『字母表』（字符串） chars。
 *
 * 假如你可以用 chars 中的『字母』（字符）拼写出 words 中的某个『单词』（字符串），那么我们就认为你掌握了这个单词。
 *
 * 注意：每次拼写时，chars 中的每个字母都只能用一次。
 *
 * 返回词汇表 words 中你掌握的所有单词的 长度之和。
 *
 *
 * Difficulty: Easy
 *
 */

public class Solution1160 {

    public int countCharacters(String[] words, String chars) {
        int[] counter = new int[26];
        for (char c: chars.toCharArray()) {
            counter[c - 'a']++;
        }
        int res = 0;
        for (String word: words) {
            boolean invalid = false;
            int[] temp = Arrays.copyOf(counter, counter.length);
            for (char c: word.toCharArray()) {
                if (temp[c - 'a'] == 0) {
                    invalid = true;
                    break;
                }
                temp[c - 'a']--;
            }
            if (!invalid) {
                res += word.length();
            }
        }
        return res;
    }

}
