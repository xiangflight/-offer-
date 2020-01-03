package swordoffer;


import java.util.Arrays;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/1/2
 * <p>
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * 例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */

public class Solution045 {

    public static void main(String[] args) {
        int[] numbers = {3, 32, 321};
        String s = new Solution045().PrintMinNumber(numbers);
        System.out.println(s);
    }

    public String PrintMinNumber(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return "";
        }
        int n = numbers.length;
        String[] nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = numbers[i] + "";
        }
        Arrays.sort(nums, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder builder = new StringBuilder();
        for (String val : nums) {
            builder.append(val);
        }
        return builder.toString();
    }

}
