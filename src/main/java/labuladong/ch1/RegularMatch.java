package labuladong.ch1;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2020/9/11
 */

public class RegularMatch {

    boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        while (i < s.length() && j < p.length()) {
            if (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.') {
                if (j  < p.length() - 1 && p.charAt(j + 1) == '*') {

                } else {
                    i++;
                    j++;
                }
            } else {
                if (j < p.length() - 1 && p.charAt(j + 1) == '*') {

                } else {
                    return false;
                }
            }
        }
        return i == j;
    }

}
