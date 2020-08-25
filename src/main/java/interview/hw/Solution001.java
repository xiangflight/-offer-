package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 计算字符串最后一个单词的长度，单词以空格隔开。
 * <p>
 * 输入描述:
 * 一行字符串，非空，长度小于5000。
 * <p>
 * 输出描述:
 * 整数N，最后一个单词的长度。
 * <p>
 * 输入：hello world
 * 输出：5
 */

public class Solution001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = lengthOfLastWord(str);
        System.out.println(count);
    }

    private static int lengthOfLastWord(String str) {
        int count = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }

}
