package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/9
 *
 * Difficulty: Easy
 */

public class Solution0121 {

    public int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for (int price: prices) {
            min = Math.min(price, min);
            res = Math.max(res, price - min);
        }
        return res;
    }

}
