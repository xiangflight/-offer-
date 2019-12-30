package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 * <p>
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */

public class Solution010 {

    public int Fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        int prePre = 0;
        int pre = 1;
        for (int i = 2; i <= n; i++) {
            int temp = pre;
            pre += prePre;
            prePre = temp;
        }
        return pre;
    }

}
