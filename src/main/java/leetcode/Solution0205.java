package leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        HashMap<Character, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if (!map.containsKey(cs)) {
                if (reverseMap.containsKey(ct)) {
                    return false;
                }
                map.put(cs, ct);
                reverseMap.put(ct, cs);
            } else if (map.get(cs) != ct) {
                return false;
            }
        }
        return true;
    }

}
