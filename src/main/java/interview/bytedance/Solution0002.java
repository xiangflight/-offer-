package interview.bytedance;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/22
 */

public class Solution0002 {

    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (String element: strs) {
            while (!element.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }

}
