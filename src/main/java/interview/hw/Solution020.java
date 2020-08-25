package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/25
 */

public class Solution020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String password = sc.nextLine();
            if (password.length() <= 8) {
                System.out.println("NG");
                continue;
            }
            int count = 0;
            int[] conditions = new int[4];
            for (char c: password.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    if (conditions[0] == 0) {
                        conditions[0]++;
                        count++;
                    }
                } else if (c >= 'A' && c <= 'Z') {
                    if (conditions[1] == 0) {
                        conditions[1]++;
                        count++;
                    }
                } else if (c >= '0' && c <= '9') {
                    if (conditions[2] == 0) {
                        conditions[2]++;
                        count++;
                    }
                } else {
                    if (conditions[3] == 0) {
                        conditions[3]++;
                        count++;
                    }
                }
            }
            if (count < 3) {
                System.out.println("NG");
                continue;
            }
            boolean repeat = false;
            for (int i = 0; i < password.length() - 4; i++) {
                String subStr = password.substring(i, i + 3);
                if (password.substring(i + 1).contains(subStr)) {
                    repeat = true;
                    System.out.println("NG");
                    break;
                }
            }
            if (repeat) {
                continue;
            }
            System.out.println("OK");
        }
        sc.close();
    }

}
