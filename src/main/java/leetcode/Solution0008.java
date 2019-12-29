package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/29
 */

public class Solution0008 {

    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] arr = str.toCharArray();
        int len = arr.length;
        boolean negative = false;

        final char whiteSpace = ' ';
        int i = 0;
        while (i < len && arr[i] == whiteSpace) {
            i++;
        }
        if (i == len) {
            return 0;
        }
        if (!validCharacter(arr[i])) {
            return 0;
        }
        if (arr[i] == '+') {
            i++;
        } else if (arr[i] == '-') {
            negative = true;
            i++;
        }
        // from now should convert string to numeric
        int res = 0;
        while (i < len && isDigit(arr[i])) {
            int digit = arr[i] - '0';
            if (res > (Integer.MAX_VALUE - digit) / 10 || -res < (Integer.MIN_VALUE + digit) / 10) {
                if (negative) {
                    return Integer.MIN_VALUE;
                } else {
                    return Integer.MAX_VALUE;
                }
            }
            res = res * 10 + digit;
            i++;
        }
        // --------------
        return negative ? -res : res;
    }

    private boolean validCharacter(char c) {
        return c == '+' || c == '-' || isDigit(c);
    }

    private boolean isDigit(char c) {
        return c >= '0' && c <= '9';
    }

}
