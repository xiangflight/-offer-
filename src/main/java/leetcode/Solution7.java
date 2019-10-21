package leetcode;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Integer.MIN_VALUE;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/10/21
 */

public class Solution7 {

    public int reverse(int x) {
        boolean positive = x >= 0;
        x = positive ? x : -x;
        int res = 0;
        while (x / 10 != 0) {
            if (isOverflow(x, res)) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        if (isOverflow(x, res)) {
            return 0;
        }
        res = res * 10 + x % 10;
        return positive ? res : -res;
    }

    private boolean isOverflow(int x, int res) {
        return (MAX_VALUE - x % 10) / 10 < res;
    }

    public int reverseOfficial(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            ans = ans * 10 + pop;
            x /= 10;
        }
        return ans;
    }

    public int reverseThird(int x) {
        int ans = 0;
        int n;
        while (x != 0) {
            while (x != 0) {
                n = x % 10;
                // ans > (MAX_VALUE - n) / 10, but n / 10 always is zero, omit.
                if (ans > MAX_VALUE / 10 || ans < MIN_VALUE / 10) {
                    return 0;
                }
                ans = ans * 10 + n;
                x /= 10;
            }
        }
        return ans;
    }

}
