package interview.hw;

import java.util.Scanner;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/8/30
 */

public class Solution076 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            System.out.println(getSequeOddNum(i));
        }
        sc.close();
    }

    private static String getSequeOddNum(int m) {
        int[] nums = new int[m];
        StringBuilder builder = new StringBuilder();
        nums[0] = m * (m - 1) + 1;
        for (int i = 0; i < m; i++) {
            nums[i] = nums[0] + i * 2;
            builder.append(nums[i]).append("+");
        }
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }

}
