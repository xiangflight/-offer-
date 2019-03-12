package coding_interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author 赵翔 xiangflightATfoxmaildotcom
 * @version coding_interviews
 * @date 2019-03-12 12:03
 *
 * 字符串的排列
 *
 */

public class Solution31 {

    private ArrayList<String> result = new ArrayList<>();

    /**
     * 题目：输入一个字符串，打印出该字符串中字符的所有排列。例如输入
     *      字符abc，则打印出由字符a、b、c所能排列出来的所有字符串
     *      abc、acb、bac、bca、cab和cba。但是顺序不是按字典序打印的
     *
     * @param str 输入的字符串
     * @return 所有的字符排列
     */
    public ArrayList<String> permutation(String str) {
        if (str == null || str.length() == 0) {
            return result;
        }
        char[] arr = str.toCharArray();
        permutation(arr, 0);
        Collections.sort(result);
        return result;
    }

    /**
     * 字符数组的排列
     *
     * @param arr 字符数组
     * @param begin 起始位置
     */
    private void permutation(char[] arr, int begin) {
        if (begin == arr.length - 1) {
            String cur = String.valueOf(arr);
            if (!result.contains(cur)) {
                result.add(cur);
            }
            return;
        }
        for (int i = begin; i < arr.length; i++) {
            swap(arr, begin, i);
            permutation(arr, begin + 1);
            // 完成后还需要交换回来
            swap(arr, begin, i);

        }
    }

    /**
     * 交换i和j位置的字符
     *
     * @param arr 字符数组
     * @param i 索引i
     * @param j 索引j
     */
    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        final ArrayList<String> str = new Solution31().permutation("abcd");
        for (String c: str) {
            System.out.print(c + " ");
        }
        System.out.println();
    }


}
