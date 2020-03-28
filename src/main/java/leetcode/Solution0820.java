package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/28
 */

public class Solution0820 {

    public int minimumLengthEncoding(String[] words) {
        Arrays.sort(words, (o1, o2) -> o2.length() - o1.length());
        int res = 0;
        Set<String> set = new HashSet<>();
        for (String word: words) {
            if (!set.contains(word)) {
                res += (word.length() + 1);
                for (int i = 0; i < word.length(); i++) {
                    set.add(word.substring(i));
                }
            }
        }
        return res;
    }

}
