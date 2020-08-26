package interview.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/26
 * <p>
 * 题目描述
 * 编写一个程序，将输入字符串中的字符按如下规则排序。
 * <p>
 * 规则 1 ：英文字母从 A 到 Z 排列，不区分大小写。
 * <p>
 * 如，输入： Type 输出： epTy
 * <p>
 * 规则 2 ：同一个英文字母的大小写同时存在时，按照输入顺序排列。
 * <p>
 * 如，输入： BabA 输出： aABb
 * <p>
 * 规则 3 ：非英文字母的其它字符保持原来的位置。
 * <p>
 * <p>
 * 如，输入： By?e 输出： Be?y
 * <p>
 * <p>
 * 注意有多组测试数据，即输入有多行，每一行单独处理（换行符隔开的表示不同行）
 * <p>
 * 输入：A Famous Saying: Much Ado About Nothing (2012/8).
 * <p>
 * 输出：A aaAAbc dFgghh: iimM nNn oooos Sttuuuy (2012/8).
 */

public class Solution026 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String res = sort(line);
            System.out.println(res);
        }
        sc.close();
    }

    private static String sort(String line) {
        List<Character> letters = new ArrayList<>();
        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.add(ch);
            }
        }
        letters.sort(Comparator.comparingInt(Character::toLowerCase));
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                sb.append(letters.get(j++));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }


}
