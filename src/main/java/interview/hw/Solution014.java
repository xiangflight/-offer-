package interview.hw;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/25
 */

public class Solution014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        for (String val: arr) {
            System.out.println(val);
        }
    }

}
