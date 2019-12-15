package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/14
 */

public class Solution0125 {

    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        char[] arr = s.toCharArray();
        for (int i = 0, j = arr.length - 1; i < j; ) {
            if (notAlphanumeric(arr[i])) {
                i++;
            } else if (notAlphanumeric(arr[j])) {
                j--;
            } else if (isEqual(arr[i], arr[j])) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isEqual(char a, char b) {
        return (a == b) || ((b >= 'A' && b <= 'Z') && (a - 32 == b)) || ((a >= 'A' && a <= 'Z') && (b - 32 == a));
    }

    public boolean notAlphanumeric(char c) {
        return !((c >= '0' && c <= '9') || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
}
