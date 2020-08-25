package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 写出一个程序，接受一个十六进制的数，输出该数值的十进制表示。（多组同时输入 ）
 * <p>
 * 输入描述:
 * 输入一个十六进制的数值字符串。
 * <p>
 * 输出描述:
 * 输出该数值的十进制字符串。
 * <p>
 * 输入：0xA
 * <p>
 * 输出：10
 */

public class Solution005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(hexConvertToDecimal(str));
        }
    }

    private static int hexConvertToDecimal(String str) {
        int[] ext = {10, 11, 12, 13, 14, 15, 16};
        int result = 0;
        for (int i = 2; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A') {
                result = result * 16 + ext[c - 'A'];
            } else {
                result = result * 16 + (c - '0');
            }
        }
        return result;
    }

}
