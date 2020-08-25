package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 写出一个程序，接受一个由字母和数字组成的字符串，和一个字符，然后输出输入字符串中含有该字符的个数。不区分大小写。
 * <p>
 * 输入描述:
 * 第一行输入一个由字母和数字以及空格组成的字符串，第二行输入一个字符。
 * <p>
 * 输出描述:
 * 输出输入字符串中含有该字符的个数。
 * <p>
 * 输入：
 * ABCDEF
 * A
 * <p>
 * 输出：1
 */

public class Solution002 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char target = sc.nextLine().charAt(0);
        int count = countOfCharacter(input, target);
        System.out.println(count);
    }

    private static int countOfCharacter(String input, char target) {
        int count = 0;
        for (char c : input.toLowerCase().toCharArray()) {
            if (c == target) {
                count++;
            }
        }
        return count;
    }

}
