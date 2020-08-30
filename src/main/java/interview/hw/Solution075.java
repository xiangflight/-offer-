package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/30
 */

public class Solution075 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            char[] ch1Arr = sc.nextLine().toCharArray();
            char[] ch2Arr = sc.nextLine().toCharArray();
            int len = longestLenOfCommonSubstring(ch1Arr, ch2Arr);
            System.out.println(len);
        }
        sc.close();
    }

    private static int longestLenOfCommonSubstring(char[] arr1, char[] arr2) {
        int max = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int count = 0;
                int t1 = i;
                int t2 = j;
                while (arr1[t1] == arr2[t2]) {
                    count++;
                    t1++;
                    t2++;
                    max = Math.max(count, max);
                    if (t1 == arr1.length || t2 == arr2.length) {
                        break;
                    }
                }
            }
        }

        return max;
    }

}
