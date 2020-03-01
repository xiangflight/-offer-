package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/18
 */

public class Solution0143 {

    public static void main(String[] args) {
        String s = "aab";
        List<List<String>> partition = new Solution0143().partition(s);
        System.out.println(partition);
    }

    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        if (s.isEmpty()) {
            return res;
        }
        backtrack(s, 0, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(String s, int pos, ArrayList<String> temp, List<List<String>> res) {
        if (pos == s.length()) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = pos; i < s.length(); i++) {
            if (!checkPalindrome(s, pos, i)) {
                continue;
            }
            temp.add(s.substring(pos, i + 1));
            backtrack(s, i + 1, temp, res);
            temp.remove(temp.size() - 1);
        }
    }

    private boolean checkPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
