package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/3
 *
 * 题目描述
 * •计算一个数字的立方根，不使用库函数
 *
 * 详细描述：
 *
 * •接口说明
 *
 * 原型：
 *
 * public static double getCubeRoot(double input)
 *
 * 输入:double 待求解参数
 *
 * 返回值:double  输入参数的立方根，保留一位小数
 */

public class Solution107 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            double n = sc.nextDouble();
            double x = 1.0;
            while (Math.abs(Math.pow(x, 3) - n) > 1e-3) {
                x = x - ((Math.pow(x, 3) - n) / (3 * Math.pow(x, 2)));
            }
            System.out.printf("%.1f", x);
        }
        sc.close();
    }

}
