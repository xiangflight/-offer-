package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质因子（重复的也要列举）（如180的质因子为2 2 3 3 5 ）
 * <p>
 * 最后一个数后面也要有空格
 * <p>
 * 输入描述:
 * 输入一个long型整数
 * <p>
 * 输出描述:
 * 按照从小到大的顺序输出它的所有质数的因子，以空格隔开。最后一个数后面也要有空格。
 * <p>
 * 输入
 * 180
 * <p>
 * 输出
 * 2 2 3 3 5
 */

public class Solution006 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        for (int i = 2; i <= num; i++) {
            while ((num % i) == 0) {
                System.out.print(i + " ");
                num /= i;
            }
        }
    }
}
