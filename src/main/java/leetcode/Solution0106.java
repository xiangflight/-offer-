package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/3/16
 *
 * Difficulty: Easy
 *
 * 输入："aabcccccaaa"
 *  输出："a2b1c5a3"
 */

public class Solution0106 {

    public String compressString(String S) {
        if (S.isEmpty()) {
            return S;
        }
        StringBuilder sb = new StringBuilder();
        char last = S.charAt(0);
        int count = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != last) {
                sb.append(last).append(count);
                last = S.charAt(i);
                count = 0;
            }
            count++;
        }
        sb.append(last).append(count);
        return sb.length() >= S.length() ? S: sb.toString();
    }

}
