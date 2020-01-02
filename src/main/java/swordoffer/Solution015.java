package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 * <p>
 * 判断是否是2的幂次方 n & (n - 1) == 0，说明二进制表示中只有一个1，
 * 那么它就是2的幂次方
 */

public class Solution015 {

    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0) {
            count++;
            n &= (n - 1);
        }
        return count;
    }
}
