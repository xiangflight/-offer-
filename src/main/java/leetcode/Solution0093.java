package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0093 {

    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    /**
     *
     * @param s s
     * @param pos 当前扫描到的 s 的位置
     * @param temp 当前所保存的ip段
     * @param res 最终结果
     */
    private void backtrack(String s, int pos, ArrayList<String> temp, List<String> res) {
        if (temp.size() >= 4) {
            if (pos == s.length()) {
                res.add(String.join(".", temp));
            }
            return;
        }
        for (int i = 1; i <= 3; i++) {
            if (pos + i > s.length()) {
                break;
            }
            String segment = s.substring(pos, pos + i);
            if (segment.startsWith("0") && segment.length() > 1 || (i == 3 && Integer.parseInt(segment) > 255)) {
                break;
            }
            temp.add(segment);
            backtrack(s, pos + i, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

}
