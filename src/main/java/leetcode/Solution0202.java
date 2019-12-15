package leetcode;

import java.util.HashSet;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/15
 */

public class Solution0202 {

    public boolean isHappy(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = getSum(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += (digit * digit);
            n /= 10;
        }
        return sum;
    }

}
