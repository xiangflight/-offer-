package leetcode;

import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/2/26
 */

public class Solution2000 {

    public static void main(String[] args) {
        int[] ans = new Solution2000().fraction(new int[]{1, 2});
        System.out.println(Arrays.toString(ans));
    }

    public int[] fraction(int[] cont) {
        int len = cont.length;
        int[] ans = {1, 1};
        int i = len - 2;
        ans[1] = cont[len - 1];
        while (i >= 0) {
            int tmp = ans[1];
            ans[1] = ans[1] * cont[i] + ans[0];
            ans[0] = tmp;
            i--;
        }
        return ans;
    }

}
