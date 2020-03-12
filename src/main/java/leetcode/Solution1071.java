package leetcode;

import java.util.Objects;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/12
 * <p>
 * 对于字符串 S 和 T，只有在 S = T + ... + T（T 与自身连接 1 次或多次）时，我们才认定 “T 能除尽 S”。
 * <p>
 * 返回最长字符串 X，要求满足 X 能除尽 str1 且 X 能除尽 str2。
 * <p>
 * 输入：str1 = "ABCABC", str2 = "ABC"
 * 输出："ABC"
 * <p>
 * 输入：str1 = "ABABAB", str2 = "ABAB"
 * 输出："AB"
 * <p>
 * 输入：str1 = "LEET", str2 = "CODE"
 * 输出：""
 * <p>
 * 满足：
 * 1 <= str1.length <= 1000
 * 1 <= str2.length <= 1000
 * str1[i] 和 str2[i] 为大写英文字母
 *
 * Difficulty: Easy
 */

public class Solution1071 {

    public String gcdOfStrings(String str1, String str2) {
        if (invalid(str1, str2)) {
            return "";
        }
        if (!Objects.equals(str1 + str2, str2 + str1)) {
            return "";
        }
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    public boolean invalid(String str1, String str2) {
        return str1 == null || str2 == null || str1.isEmpty() || str2.isEmpty();
    }

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public int gcdRecursive(int a, int b) {
        return b == 0 ? a : gcdRecursive(b, a % b);
    }
}
