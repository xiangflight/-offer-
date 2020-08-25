package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 *
 * 题目描述
 * 描述：
 *
 * 输入一个整数，将这个整数以字符串的形式逆序输出
 *
 * 程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
 *
 * 输入：1516000
 *
 * 输出：0006151
 *
 */

public class Solution011 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        StringBuilder strBuilder = new StringBuilder();
        while (num != 0) {
            int remainder = num % 10;
            strBuilder.append(remainder);
            num /= 10;
        }
        System.out.println(strBuilder.toString());
    }

}
