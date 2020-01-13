package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/21
 */

public class Solution0017 {

    final String[] letterMap = {
            " ",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits.isEmpty()) {
            return res;
        }
        findCombination(digits, 0, "", res);
        return res;
    }

    /**
     * @param digits 传入的数字字符串
     * @param pos    处理到字符的位置
     * @param s      保存此时从 digits[0..pos-1]翻译得到的一个字母字符串
     */
    void findCombination(String digits, int pos, String s, List<String> res) {
        if (pos == digits.length()) {
            // 此时获得的 s 已经是一个解，保存
            res.add(s);
            return;
        }
        char c = digits.charAt(pos);
        String letters = letterMap[c - '0'];
        for (char a : letters.toCharArray()) {
            findCombination(digits, pos + 1, s + a, res);
        }
    }

}
