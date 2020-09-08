package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class Solution082 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            StringBuilder sb = new StringBuilder();
            String num = sc.nextLine();
            int n = Integer.parseInt(num.substring(0, num.indexOf("/")));
            String denominator = num.substring(num.indexOf("/") + 1);
            while (n-- > 0) {
                sb.append("1/").append(denominator).append("+");
            }
            sb.deleteCharAt(sb.length() - 1);
            System.out.println(sb.toString());
        }
        sc.close();
    }

}
