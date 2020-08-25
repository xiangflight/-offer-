package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
 * <p>
 * 输入描述:
 * 输入一个正浮点数值
 * <p>
 * 输出描述:
 * 输出该数值的近似整数值
 * <p>
 * 输入：5.5
 * <p>
 * 输出：6
 */

public class Solution007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println((int)(num + 0.5));
    }

}
