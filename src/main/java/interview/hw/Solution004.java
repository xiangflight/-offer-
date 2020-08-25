package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 * <p>
 * 题目描述
 * 连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组；
 * 长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
 * <p>
 * 输入描述:
 * 连续输入字符串(输入2次,每个字符串长度小于100)
 * <p>
 * 输出描述:
 * 输出到长度为8的新字符串数组
 * <p>
 * 输入
 * abc
 * 123456789
 * <p>
 * 输出
 * abc00000
 * 12345678
 * 90000000
 */

public class Solution004 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            while (line.length() > 8) {
                String tmp = line.substring(0, 8);
                System.out.println(tmp);
                line = line.substring(8);
            }
            int addZero = 8 - line.length();
            StringBuilder strBuilder = new StringBuilder(line);
            while (addZero-- > 0) {
                strBuilder.append("0");
            }
            System.out.println(strBuilder.toString());
        }
    }

}
