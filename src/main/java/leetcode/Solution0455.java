package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/25
 */

public class Solution0455 {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(s);
        Arrays.sort(g);
        int si = s.length - 1;
        int gi = g.length - 1;
        int res = 0;
        while (gi >= 0 && si >= 0) {
            if (s[si] >= g[gi]) {
                res++;
                si--;
            }
            gi--;
        }
        return res;
    }

}
