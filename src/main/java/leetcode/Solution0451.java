package leetcode;

import java.util.*;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0451 {

    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        TreeMap<Integer, List<Character>> treeMap = new TreeMap<>(Comparator.reverseOrder());
        map.forEach((c, v) -> {
            if (!treeMap.containsKey(v)) {
                treeMap.put(v, new ArrayList<>());
            }
            treeMap.get(v).add(c);
        });
        StringBuilder builder = new StringBuilder();
        treeMap.forEach((count, list) -> {
            list.forEach(e -> {
                int temp = count;
                while (temp-- > 0) {
                    builder.append(e);
                }
            });
        });
        return builder.toString();
    }

}
