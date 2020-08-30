package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/27
 */

public class Solution084 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            int count = 0;
            for (char ch: str.toCharArray()) {
                if (ch >= 'A' && ch <= 'Z') {
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }

}
