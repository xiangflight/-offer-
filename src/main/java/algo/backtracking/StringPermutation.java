package algo.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/13
 */

public class StringPermutation {

    public static void main(String[] args) {
        List<String> res = new StringPermutation().permutation("abc");
        System.out.println(res);
    }

    /**
     * print permutations of a given string
     *
     * @param str a given string
     */
    public List<String> permutation(String str) {
        List<String> res = new ArrayList<>();
        findPermutation(str, "", res);
        return res;
    }

    private void findPermutation(String str, String pre, List<String> res) {
        if (0 == str.length()) {
            res.add(pre);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String rem = str.substring(0, i) + str.substring(i + 1);
            findPermutation(rem, pre + str.charAt(i), res);
        }
    }

}
