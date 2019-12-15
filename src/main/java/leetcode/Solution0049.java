package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/16
 */

public class Solution0049 {

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int idx = 0;
        for (String str : strs) {
            String frequency = frequency(str);
            if (map.containsKey(frequency)) {
                res.get(map.get(frequency)).add(str);
            } else {
                List<String> group = new ArrayList<>();
                group.add(str);
                res.add(group);
                map.put(frequency, idx++);
            }
        }

        return res;
    }

    private String frequency(String str) {
        int[] freq = new int[26];
        for (char c : str.toCharArray()) {
            freq[c - 'a']++;
        }
        StringBuilder key = new StringBuilder();
        for (int num : freq) {
            key.append(num).append("#");
        }
        return key.toString();
    }

}
