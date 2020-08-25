package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/24
 */

public class Solution012 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String str = reverse(line);
        System.out.println(str);
    }

    private static String reverse(String str) {
        char[] origin = str.toCharArray();
        for (int i = 0, j = origin.length - 1; i < j; i++, j--) {
            char c = origin[i];
            origin[i] = origin[j];
            origin[j] = c;
        }
        return new String(origin);
    }

}
