package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/25
 */

public class Solution021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origin = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String target = "bcdefghijklmnopqrstuvwxyza222333444555666777788899990123456789";
        while (sc.hasNext()) {
            String password = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char c: password.toCharArray()) {
                if ((c >= 'a') && (c <= 'z')) {
                    sb.append(target.charAt(26 + c - 'a'));
                } else if ((c >= 'A') && (c <= 'Z')) {
                    sb.append(target.charAt(c - 'A'));
                } else {
                    sb.append(c);
                }
            }
            System.out.println(sb.toString());
        }
        sc.close();
    }

}
