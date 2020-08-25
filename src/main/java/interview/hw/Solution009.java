package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 *
 * 题目描述
 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 *
 * 输入描述:
 * 输入一个int型整数
 *
 * 输出描述:
 * 按照从右向左的阅读顺序，返回一个不含重复数字的新的整数
 *
 * 输入：9876673
 *
 * 输出：37689
 *
 */

public class Solution009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = reverseNotRepeatNum(num);
        System.out.println(result);
    }

    private static int reverseNotRepeatNum(int num) {
        int result = 0;
        int[] count = new int[10];
        while (num != 0) {
            int remainder = num % 10;
            if (count[remainder] == 0) {
                result = result * 10 + remainder;
                count[remainder]++;
            }
            num /= 10;
        }
        return result;
    }

}
