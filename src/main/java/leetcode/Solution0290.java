package leetcode;

import java.util.HashMap;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0290 {

    public boolean wordPattern(String pattern, String str) {
        String[] strArr = str.split(" ");
        if (pattern.length() != strArr.length) {
            return false;
        }
        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Character> reverseMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            char c = pattern.charAt(i);
            if (!map.containsKey(c)) {
                if (reverseMap.containsKey(strArr[i])) {
                    return false;
                }
                map.put(c, strArr[i]);
                reverseMap.put(strArr[i], c);
            } else if (!map.get(c).equals(strArr[i])) {
                return false;
            }
        }
        return true;
    }

}
