package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 *
 * 题目描述
 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)，换行表示结束符，不算在字符里。不在范围内的不作统计。多个相同的字符只计算一次
 * 输入
 * abaca
 * 输出
 * 3
 *
 * 输入描述:
 * 输入N个字符，字符在ACSII码范围内。
 *
 * 输出描述:
 * 输出范围在(0~127)字符的个数。
 *
 * 输入：abc
 *
 * 输出：3
 *
 */

public class Solution010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = countOfCharacter(input);
        System.out.println(count);
    }

    private static int countOfCharacter(String str) {
        int count = 0;
        int[] counter = new int[128];
        for (char c: str.toCharArray()) {
            if (counter[c] != 0) {
                continue;
            }
            count++;
            counter[c]++;
        }
        return count;
    }

}
