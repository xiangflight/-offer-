package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/19
 */

public class Solution0022 {

    public static void main(String[] args) {
        List<String> ans = new Solution0022().generateParenthesis(3);
        System.out.println(ans);
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n == 0) {
            res.add("");
            return res;
        }
        for (int i = 0; i < n; i++) {
            for (String left : generateParenthesis(i)) {
                for (String right : generateParenthesis(n - 1 - i)) {
                    res.add("(" + left + ")" + right);
                }
            }
        }
        return res;
    }

}
