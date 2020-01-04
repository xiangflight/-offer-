package swordoffer;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/3
 *
 * 写一个函数，求两个整数之和，要求不得使用 +、-、*、/ 四则运算符号。
 *
 * a ^ b 表示没有考虑进位的情况下两数的和，(a & b) << 1 就是进位。
 *
 * 递归会终止的原因是 (a & b) << 1 最右边会多一个 0，那么继续递归，进位最右边的 0 会慢慢增多，最后进位会变为 0，递归终止。
 */

public class Solution065 {

    public int Add(int num1,int num2) {
        return num2 == 0 ? num1: Add(num1 ^ num2, (num1 & num2) << 1);
    }

    public int Add2(int num1, int num2) {
        int sum, carry;
        do {
            sum = num1 ^ num2;
            carry = (num1 & num2) << 1;
            num1 = sum;
            num2 = carry;
        } while (num2 != 0);
        return num1;
    }

}
