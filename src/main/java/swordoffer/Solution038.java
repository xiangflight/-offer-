package swordoffer;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/1
 * <p>
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。
 * 例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */

public class Solution038 {


    public static void main(String[] args) {
        ArrayList<String> res = new Solution038().Permutation("abc");
        System.out.println(res);
    }

    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if (str.length() == 0) {
            return res;
        }
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        boolean[] used = new boolean[arr.length];
        backtracking(arr, 0, new StringBuilder(), res, used);
        return res;
    }

    private void backtracking(char[] arr, int pos, StringBuilder stringBuilder, ArrayList<String> res, boolean[] used) {
        if (pos == arr.length) {
            res.add(stringBuilder.toString());
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i != 0 && arr[i] == arr[i - 1] && !used[i - 1]) {
                continue;
            }
            stringBuilder.append(arr[i]);
            used[i] = true;
            backtracking(arr, pos + 1, stringBuilder, res, used);
            used[i] = false;
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }

}
