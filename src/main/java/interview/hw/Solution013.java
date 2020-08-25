package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 */

public class Solution013 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String reverseLine = reverse(line);
        System.out.println(reverseLine);
    }

    private static String reverse(String sentence) {
        StringBuilder builder = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            builder.append(words[i]).append(" ");
        }
        return builder.toString();
    }
}
