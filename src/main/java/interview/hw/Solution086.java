package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/27
 *
 * 题目描述
 * 功能: 求一个byte数字对应的二进制数字中1的最大连续数，例如3的二进制为00000011，最大连续2个1
 *
 * 输入: 一个byte型的数字
 *
 * 输出: 无
 *
 * 返回: 对应的二进制数字中1的最大连续数
 *
 * 输入描述:
 * 输入一个byte数字
 *
 * 输出描述:
 * 输出转成二进制之后连续1的个数
 *
 * 输入：3
 *
 * 输入：2
 */

public class Solution086 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int num = sc.nextInt();
            int max = 0;
            int curr = 0;
            while (num != 0) {
                if ((num & 0x1) == 1) {
                    curr++;
                } else {
                    curr = 0;
                }
                num >>>= 1;
                max = Math.max(curr, max);
            }
            System.out.println(max);
        }
        sc.close();
    }

}
