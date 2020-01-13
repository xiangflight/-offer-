package cc189;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/9
 */

public class Solution0808 {

    public static void main(String[] args) {
        String s = "aaab";
        List<String> permutations = new Solution0808().permutations(s);
        System.out.println(permutations);
    }

    List<String> permutations(String s) {
        List<String> res = new ArrayList<>();
        if (s.isEmpty()) {
            return res;
        }
        boolean[] used = new boolean[s.length()];
        findAllPermutations(s, 0, "", res, used);
        return res;
    }

    private void findAllPermutations(String s, int index, String temp, List<String> res, boolean[] used) {
        if (index == s.length()) {
            res.add(temp);
            return;
        }
        for (int i = 0; i < s.length(); i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && s.charAt(i) == s.charAt(i - 1) && !used[i - 1]) {
                continue;
            }
            used[i] = true;
            findAllPermutations(s, index + 1, temp + s.charAt(i), res, used);
            used[i] = false;
        }
    }


}
