package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/7
 */

public class Solution046 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            int n = sc.nextInt();
            char[] arr = str.toCharArray();
            int i = 0;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > 128) {
                    count += 2;
                    if (count < n) {
                        i++;
                    }
                } else {
                    count++;
                    if (count <= n) {
                        i++;
                    }
                }
            }
            System.out.println(str.substring(0, i));
        }
        sc.close();
    }

}
