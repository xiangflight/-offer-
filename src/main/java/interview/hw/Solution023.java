package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 * <p>
 * 题目描述
 * 实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
 * 注意每个输入文件有多组输入，即多个字符串用回车隔开
 * <p>
 * 输入描述:
 * 字符串只包含小写英文字母, 不考虑非法输入，输入的字符串长度小于等于20个字节。
 * <p>
 * 输出描述:
 * 删除字符串中出现次数最少的字符后的字符串。
 * <p>
 * 输入：
 * abcdd
 * <p>
 * 输出：
 * dd
 */

public class Solution023 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            int[] count = new int[26];
            int min = Integer.MAX_VALUE;
            for (char c : line.toCharArray()) {
                count[c - 'a']++;
                if (count[c - 'a'] < min) {
                    min = count[c - 'a'];
                }
            }
            StringBuilder sb = new StringBuilder();
            for (char c : line.toCharArray()) {
                if (count[c - 'a'] == min) {
                    continue;
                }
                sb.append(c);
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }

}
